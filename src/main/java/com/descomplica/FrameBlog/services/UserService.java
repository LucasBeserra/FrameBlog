package com.descomplica.FrameBlog.services;

import java.util.List;

import com.descomplica.FrameBlog.models.User;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User update(Long id, User user);

    void deleteUser(Long id);

}
