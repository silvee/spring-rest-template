package com.silvee.service;

import com.silvee.domain.User;
import com.silvee.exception.ResourceNotFoundException;
import com.silvee.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        User user = userRepository.findOne(id);

        // if no user is found then drop custom exception
        if (user == null) {
            throw new ResourceNotFoundException(id, "user not found");
        } else {
            return user;
        }
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        User user = getUserById(id);
        if (user != null) {
            userRepository.delete(id);
        }
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}