package com.example.GestionTareas.domain.serviceImpl;

import com.example.GestionTareas.domain.repository.TaskRepository;
import com.example.GestionTareas.domain.service.TaskService;
import com.example.GestionTareas.persistence.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository repository;
    @Override
    public List<Task> findAll() {
        return repository.findAll();
    }


    @Override
    public List<Object[]>taskToday(){
        return repository.taskToday();
    }

    @Override
    public List<Object[]>findAllTaskByUser(){
        return repository.findAllTaskByUser();
    }

}
