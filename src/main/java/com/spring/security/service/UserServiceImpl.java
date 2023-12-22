package com.spring.security.service;

import com.spring.security.model.User;
import com.spring.security.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User addUser(User user) {
        return repository.save(user);
    }

    @Override
    public User findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<User> findAllUser() {

        return repository.findAll();
    }
}
