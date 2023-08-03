package com.freemusic.userservice.controllers;

import com.freemusic.userservice.mappers.UserMapper;
import com.freemusic.userservice.models.User;
import com.freemusic.userservice.services.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public void userLogin(@RequestParam("email") String email, @RequestParam("password")String password) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {

    }

    @PostMapping("/signup")
    public void signUp(@RequestBody User user){
        userService.addUser(user);
    }

    @Transactional
    @GetMapping("/search/{user_id}")
    public ResponseEntity<User> findUser(@PathVariable("user_id") int user_id) {
        UserMapper userMapper = new UserMapper();
        User user = userService.getUserById(user_id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/search/all")
    public void findAllUser() {

    }
}
