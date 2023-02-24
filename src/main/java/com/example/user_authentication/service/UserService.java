package com.example.user_authentication.service;



import com.example.user_authentication.dto.UserDto;
import com.example.user_authentication.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    UserDto getUser(Long id);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
