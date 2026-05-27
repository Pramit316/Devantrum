package com.example.devantrum.user.service;

import com.example.devantrum.user.entity.User;
import com.example.devantrum.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }


    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUser(User newUser) {
        return userRepository.save(newUser);
    }

    public void deleteUser(Long id) {
        Optional<User> user = getUserById(id);
        userRepository.delete(user.get());
    }
}
