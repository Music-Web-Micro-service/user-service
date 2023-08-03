package com.freemusic.userservice.services;

import com.freemusic.userservice.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int userId);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);


}
