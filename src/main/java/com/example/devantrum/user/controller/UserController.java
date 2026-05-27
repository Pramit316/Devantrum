package com.example.devantrum.user.controller;

import com.example.devantrum.user.entity.User;
import com.example.devantrum.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/")
    public User  addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("get/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return  userService.getUserById(id);
    }

    @PutMapping("update/{id}")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
