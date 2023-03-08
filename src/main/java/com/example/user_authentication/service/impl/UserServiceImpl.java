package com.example.user_authentication.service.impl;

import com.example.user_authentication.dto.RegisterRequest;
import com.example.user_authentication.dto.UserResponse;
import com.example.user_authentication.entity.Role;
import com.example.user_authentication.entity.User;
import com.example.user_authentication.exception.user.UserNotFoundException;
import com.example.user_authentication.repository.RoleRepository;
import com.example.user_authentication.repository.UserRepository;
import com.example.user_authentication.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.example.user_authentication.utils.Convertor.convertEntityToResponse;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public void saveUser(RegisterRequest userDto) {
        User user = new User();
        user.setName(userDto.getFirstName() + " " + userDto.getLastName());
        user.setEmail(userDto.getEmail());

        //encrypt the password once we integrate spring security
        //user.setPassword(userDto.getPassword());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        Role role = roleRepository.findByName("ROLE_USER");
        if(role == null){
            role = checkUserRoleExist();
        }
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void saveAdmin(RegisterRequest registerRequest) {

        User user = new User();
        user.setName(registerRequest.getFirstName() + " " + registerRequest.getLastName());
        user.setEmail(registerRequest.getEmail());

        //encrypt the password once we integrate spring security
        //user.setPassword(userDto.getPassword());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        Role role = roleRepository.findByName("ROLE_ADMIN");
        if(role == null){
            role = checkAdminRoleExist();
        }
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }


    @Override
    public UserResponse getUser(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent())
        {
            User user = userOptional.get();
            return convertEntityToResponse(user);
        }
        else
        {
            throw new UserNotFoundException("User with id " + id + " not found");
        }
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<UserResponse> findAllUsers() {
        List<User> users = userRepository.findAll();
        if(users.isEmpty())
        {
            throw new UserNotFoundException("No users were found in the database");
        }
        return users.stream().map((user) -> convertEntityToResponse(user))
                .collect(Collectors.toList());
    }

    @Transactional
    public Role checkAdminRoleExist() {

        Role role = new Role();
        role.setName("ROLE_ADMIN");
        return roleRepository.save(role);
    }
    @Transactional
    public Role checkUserRoleExist() {

        Role role = new Role();
        role.setName("ROLE_USER");
        return roleRepository.save(role);
    }
}
