package com.example.user_authentication.utils;

import com.example.user_authentication.dto.UserResponse;
import com.example.user_authentication.entity.Role;
import com.example.user_authentication.entity.User;

import java.util.stream.Collectors;

public class Convertor {

    public static UserResponse convertEntityToResponse(User user){
        UserResponse userResponse = new UserResponse();
        String[] name = user.getName().split(" ");
        userResponse.setFirstName(name[0]);
        userResponse.setLastName(name[1]);
        userResponse.setEmail(user.getEmail());
        userResponse.setRoles(user.getRoles().stream().map(Role::getName).collect(Collectors.toList()));
        return userResponse;
    }
}
