package com.example.user_authentication.utils;

import com.example.user_authentication.dto.UserDto;
import com.example.user_authentication.entity.User;

public class Convertor {

    public static  UserDto convertEntityToDto(User user){
        UserDto userDto = new UserDto();
        String[] name = user.getName().split(" ");
        userDto.setFirstName(name[0]);
        userDto.setLastName(name[1]);
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
