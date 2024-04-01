package com.example.GestionTareas.web.controller;

import com.example.GestionTareas.domain.security.JWTAuthenticationConfig;
import com.example.GestionTareas.domain.service.UserService;
import com.example.GestionTareas.persistence.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;


    @Autowired
    JWTAuthenticationConfig jwtAuthenticationConfig;

    @Operation(summary="Register a user into application given permissions")
    @PostMapping("/login") //Este es para el login con el token y que permita ver las consultas
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public User login(
            @RequestParam("user") String username,
            @RequestParam("encryptedPass") String encryptedPass) {

        String token = jwtAuthenticationConfig.getJWTToken(username);
        return new User(username, encryptedPass, token);

    }


    @Operation(summary="Get all users for the application")
    @GetMapping("/findall")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public List<User> findAll(){
        return userService.findAll();
    }


}
