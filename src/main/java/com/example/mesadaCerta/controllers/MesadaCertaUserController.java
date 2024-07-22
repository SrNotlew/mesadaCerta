package com.example.mesadaCerta.controllers;

import com.example.mesadaCerta.user.records.RegisterUserRequestDTO;
import com.example.mesadaCerta.user.User;
import com.example.mesadaCerta.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class MesadaCertaUserController {
    @RequestMapping("/hello")
    String home() {
        return "Hello Users!";
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users_list")
    public ResponseEntity findAll() {
        var listUsers = userRepository.findAllByActiveTrue();
        return ResponseEntity.ok(listUsers);
    }

    @PostMapping("/register")
    public ResponseEntity registerUser(@RequestBody RegisterUserRequestDTO data) {
        User newUser = new User(data);
        userRepository.save(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/edit/{requestedId}")
    private ResponseEntity<Void> putCashCard(@PathVariable String requestedId, @RequestBody RegisterUserRequestDTO data) {
        var userUpdate = userRepository.findById(requestedId).map(user -> {
            user.setUsername(data.username());
            user.setFirstName(data.firstName());
            user.setLastName(data.lastName());
            user.setEmail(data.email());
            user.setPassword(data.password());
            return  userRepository.save(user);
        });

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/edit/{requestedId}")
    private ResponseEntity<Void> deleteCashCard(@PathVariable String requestedId) {
        var userUpdate = userRepository.findById(requestedId).map(user -> {
            user.setActive(false);
            return  userRepository.save(user);
        });

        return ResponseEntity.noContent().build();
    }



}
