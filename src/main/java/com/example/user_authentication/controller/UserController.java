package com.example.user_authentication.controller;

import com.example.user_authentication.dto.LoginRequest;
import com.example.user_authentication.dto.LoginResponse;
import com.example.user_authentication.dto.UserDto;
import com.example.user_authentication.entity.User;
import com.example.user_authentication.exception.user.UserAlreadyTakenException;
import com.example.user_authentication.security.UserDetailsImpl;
import com.example.user_authentication.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-api")
public class UserController {

   private final UserService userService;
   private final  AuthenticationManager authenticationManager;

    public UserController(UserService userService, AuthenticationManager authenticationManager) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }

    @RequestMapping("")
    public ResponseEntity<List<UserDto>> findAllUsers()
    {
        List<UserDto> users = userService.findAllUsers();

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto>findUser(@PathVariable Long id)
    {
        UserDto user = userService.getUser(id);
        return ResponseEntity.ok().body(user);
    }


    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody UserDto userDto)
    {
        User existing = userService.findByEmail(userDto.getEmail());
        if (existing != null)
        {
            throw new UserAlreadyTakenException("Email is already in use");
        }
        userService.saveUser(userDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    @PostMapping("/signin")
    public ResponseEntity<LoginResponse> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

       Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority()).toList();

        LoginResponse response = new LoginResponse();
        response.setFullName(userDetails.getUserNameInfo());// aici intoarcem USERNAME
        response.setEmail(userDetails.getUsername()); // intoarce EMAIL in loc de USERNAME!!!
        response.setRole(roles.get(0));

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
    }

}
