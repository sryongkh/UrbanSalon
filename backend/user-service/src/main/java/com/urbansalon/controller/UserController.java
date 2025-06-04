package com.urbansalon.controller;

import java.util.List;
import java.util.Optional;

import com.urbansalon.modal.User;
import com.urbansalon.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/api/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/api/users/{id}")
    public User getUserById(Long id) throws Exception {
        Optional<User> opt = userRepository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        throw new Exception("User not found");
    }

    @PutMapping("/api/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) throws Exception {
        Optional<User> opt = userRepository.findById(id);
        if (opt.isEmpty()) {
            throw new Exception("User not found with id: " + id);
        }
        User existingUser = opt.get();
        existingUser.setFullName(user.getFullName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhone(user.getPhone());
        existingUser.setRole(user.getRole());
        return userRepository.save(existingUser);
    }

    @DeleteMapping("/api/users/{id}")
    public String deleteUser(@PathVariable Long id) throws Exception {
        Optional<User> opt = userRepository.findById(id);
        if (opt.isEmpty()) {
            throw new Exception("User not found with id: " + id);
        }
        userRepository.deleteById(opt.get().getId());
        return "User deleted successfully";
    }
}
