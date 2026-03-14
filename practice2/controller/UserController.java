package com.practice2.practice2.controller;

import com.practice2.practice2.entity.User;
import com.practice2.practice2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/profile/{id}")
    public User getProfile(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/profile/{id}")
    public User updateProfile(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
}