package com.example.JourneyManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest{

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCreateUser(){
        // Create a User Object
        User user = new User();
        user.setUsername("testuser");
        user.setEmail("testuser@example.com");
        user.setPassword("password123");

        // Save the user
        userRepository.save(user);

        // Retrieve and print the user
        User retrievedUser = userRepository.findById(user.getId()).orElse(null);
        System.out.println("Retrieved User: " + retrievedUser.getUsername() + " Email: " + retrievedUser.getEmail());

    }

    @Test
    public void testUser2(){
        // Create a User Object
        User user = new User();
        user.setUsername("testuser2");
        user.setEmail("testuser2@example.com");
        user.setPassword("password123");

        // Save the user
        userRepository.save(user);

        // Retrieve and print the user
        User retrievedUser = userRepository.findById(user.getId()).orElse(null);
        System.out.println("Retrieved User: " + retrievedUser.getUsername() + " Email: " + retrievedUser.getEmail());

    }


}
