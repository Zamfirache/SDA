package com.example.user_authentication.exception.user;

public class UserAlreadyTakenException extends RuntimeException{
    public UserAlreadyTakenException(String message)
    {
        super(message);
    }
}
