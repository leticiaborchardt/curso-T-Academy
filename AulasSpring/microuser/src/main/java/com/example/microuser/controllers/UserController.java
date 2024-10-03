package com.example.microuser.controllers;

import com.example.microuser.dtos.UserDTO;
import com.example.microuser.entities.User;
import com.example.microuser.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody @Valid UserDTO userDTO) {
        var user = new User();

        BeanUtils.copyProperties(userDTO, user);

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }
}
