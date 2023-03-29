package com.haolin.carbonenergy.controller;

import com.haolin.carbonenergy.model.User;
import com.haolin.carbonenergy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carbon-energy")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/save-user")
    public String saveUser(@RequestBody User user) {
        userRepository.save(user);
        return "user saved with id: " + user.getId() + "; energy: " + user.getEnergy() + "; trees: " + user.getTreesPlanted();
    }

    @GetMapping("/find-user")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/find-user/{id}")
    public Optional<User> getUser(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
        return "user deleted with id: " + id;
    }
}
