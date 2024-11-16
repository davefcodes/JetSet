package com.example.JourneyManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/Home")
    public String hello() {
        return "Welcome to Journey Manager Application by DF engineering team.";
    }
}
