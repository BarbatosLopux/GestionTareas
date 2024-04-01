package com.example.GestionTareas.domain.service;

import com.example.GestionTareas.persistence.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();


    List<Object[]>taskToday();

    List<Object[]>findAllTaskByUser();


}
