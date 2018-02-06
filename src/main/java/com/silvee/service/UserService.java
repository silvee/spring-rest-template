package com.silvee.service;

import com.silvee.domain.User;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();

}