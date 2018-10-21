package com.soumen.portalapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public User create(@RequestBody User u) {
        return service.createUser(u);

    }

    @GetMapping(path = "/{id}")
    public User findOne(@PathVariable("id") String userId) {

        return service.findById(userId);

    }

    @GetMapping
    public List<User> findAll() {
        return service.findAll();
    }
}
