package com.example.JourneyManager;

import jakarta.persistence.*;


@Entity
@Table(name = "users", schema = "jetset")
public class User{

    @Id // Primary key for the entity table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generates unique IDs for each entity instance
    private Integer id;
    private String username;
    private String email;
    private String password;


    // Default constructor required by JPA
    // JPA requires a no-argument constructor for entity classes
    public User() {}
    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }


    // Getters
    public Integer getId(){
        return this.id;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }


    // Setters
    public void setId(Integer id){
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }


}//end main
