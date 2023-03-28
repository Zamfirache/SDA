package com.example.user_authentication.controller;

import com.example.user_authentication.dto.UserResponse;
import com.example.user_authentication.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-api")
public class UserController {

   private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("")
    public ResponseEntity<List<UserResponse>> findAllUsers()
    {
        List<UserResponse> users = userService.findAllUsers();

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse>findUser(@PathVariable Long id)
    {
        UserResponse user = userService.getUser(id);
        return ResponseEntity.ok().body(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id)
    {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

}
