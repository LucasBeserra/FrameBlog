package com.descomplica.FrameBlog.services.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.descomplica.FrameBlog.models.User;
import com.descomplica.FrameBlog.repositories.UserRepository;
import com.descomplica.FrameBlog.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        User existingUser = userRepository.findByUsername(user.getName());

        if (Objects.isNull(existingUser)) {
            throw new RuntimeException("User already exists");
        }
        
        User entity = new User(user.getUserId(), user.getName(), user.getPassword(), user.getName(), user.getRole());

        User newUser = userRepository.save(entity);

        return new User(newUser.getUserId(),newUser.getName(), newUser.getPassword(), newUser.getName(), newUser.getRole());
    }
}
