/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package dev.umbra.SpringSecurityJWT.api.controller;

import dev.umbra.SpringSecurityJWT.domain.model.User;
import dev.umbra.SpringSecurityJWT.domain.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Sam_Umbra
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserRepository userRepo;
    
    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void signup(@Valid @RequestBody User user) {
        userRepo.save(user);
    }
}
