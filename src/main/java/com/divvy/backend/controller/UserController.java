package com.divvy.backend.controller;

import com.divvy.backend.model.User;
import com.divvy.backend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
//
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
