package com.practice2.practice2.service;


import com.practice2.practice2.entity.Users;
import com.practice2.practice2.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    UsersRepo usersRepo;

    public Users addUser(Users users) {
        return usersRepo.save(users);
    }

    public List<Users> getAllUsers() {
        return usersRepo.findAll();
    }

    public Users getUserById(Long id) {
        return usersRepo.findById(id).orElse(null);
    }

    public Users updateUser(Long id, Users users) {
        Users existingUser = usersRepo.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setName(users.getName());
            existingUser.setAddress(users.getAddress());
            existingUser.setAge(users.getAge());
            return usersRepo.save(existingUser);
        }
        return null;
    }

    public void deleteUser(Long id) {
        usersRepo.deleteById(id);
    }
}
