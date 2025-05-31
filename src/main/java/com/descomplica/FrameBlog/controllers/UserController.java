package com.descomplica.FrameBlog.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.descomplica.FrameBlog.models.User;
import com.descomplica.FrameBlog.services.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path ="/save")
    public @ResponseBody User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping(path = "/getAll")
    public @ResponseBody List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/getById/{id}")
    public @ResponseBody User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping(path = "/update")
    public @ResponseBody User update(@RequestParam final Long id, @RequestBody final User user) {
        return userService.update(id, user);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<?> delete(@RequestParam final Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/")
    public @ResponseBody String authentication() {
        return "Autenticação efetuada com sucesso";
    }
    
}
