package com.example.JourneyManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController()

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/Home")
    public String hello() {
        return "Welcome to Journey Manager Application by DF engineering team.";
    }

    @GetMapping("/GetUser")
    public Iterable<User> getUser(){
        return userRepository.findAll();

    }

    @PostMapping("/AddUser")
    public User addUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }





}
