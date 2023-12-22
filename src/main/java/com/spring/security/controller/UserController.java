package com.spring.security.controller;

import com.spring.security.model.User;
import com.spring.security.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public User addUser(@RequestBody User user){

        return service.addUser(user);
    }

    @PostMapping("/fetch/{id}")
    public User findById(@PathVariable("id") Integer id){

        return service.findById(id);
    }

    @PostMapping("/fetchAll")
    public List<User> findById(){

        return service.findAllUser();
    }
}
