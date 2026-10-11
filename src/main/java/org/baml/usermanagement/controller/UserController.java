package org.baml.usermanagement.controller;

import org.baml.usermanagement.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return List.of(
                new User("John", "Doe", "john.doe@example.com"),
                new User("Jane", "Smith", "jane.smith@example.com"),
                new User("Alice", "Johnson", "alice.johnson@example.com")
        );
    }
}
