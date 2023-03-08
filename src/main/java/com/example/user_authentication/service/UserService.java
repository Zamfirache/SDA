package com.example.user_authentication.service;



import com.example.user_authentication.dto.RegisterRequest;
import com.example.user_authentication.dto.UserResponse;
import com.example.user_authentication.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(RegisterRequest userDto);

    void saveAdmin(RegisterRequest userDto);
    UserResponse getUser(Long id);

    User findByEmail(String email);
    List<UserResponse> findAllUsers();
}
