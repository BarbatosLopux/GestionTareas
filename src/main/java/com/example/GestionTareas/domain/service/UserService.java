package com.example.GestionTareas.domain.service;

import com.example.GestionTareas.persistence.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
}
