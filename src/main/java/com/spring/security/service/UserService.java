package com.spring.security.service;

import com.spring.security.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User findById(Integer id);
    List<User> findAllUser();
}
