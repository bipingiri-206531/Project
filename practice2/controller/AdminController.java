package com.practice2.practice2.controller;


import com.practice2.practice2.entity.User;
import com.practice2.practice2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserService userService;

    // Post Mapping
    public User createUser(@RequestBody User user) {
        return userService.createUsers(user);
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Get User By id
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // Update User By id
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User user) {
        return userService.updateUser(id,user);
    }

    // Delete User By id
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
