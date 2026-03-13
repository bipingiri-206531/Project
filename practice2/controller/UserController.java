package com.practice2.practice2.controller;

import com.practice2.practice2.entity.Users;
import com.practice2.practice2.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UsersService usersService;

    @PostMapping
    public Users createUser(@RequestBody Users users) {
        return usersService.addUser(users);
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Long id) {
        return usersService.getUserById(id);
    }

    @PutMapping("/{id}")
    public Users updateUser(@PathVariable Long id, @RequestBody Users users) {
        return usersService.updateUser(id, users);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        usersService.deleteUser(id);
        return "User deleted successfully";
    }
}