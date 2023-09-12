package com.example.expensemgmt.controller;

import com.example.expensemgmt.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users")
    public User getUsers() {
            User user = new User("Sahena", "Maharjan", 2000);
            return user;
    }
}
