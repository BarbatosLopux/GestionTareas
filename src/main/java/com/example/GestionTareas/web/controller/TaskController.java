package com.example.GestionTareas.web.controller;

import com.example.GestionTareas.domain.service.TaskService;
import com.example.GestionTareas.persistence.entity.Task;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/Task")
@Tag(name="Task Resources")
public class TaskController {
    @Autowired
    TaskService taskService;
    @Operation(summary = "Get all task for the application")
    @GetMapping("/findall")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name="bearerAuth")
    public List<Task> findAll(){
        return taskService.findAll();
    }


    @Operation(summary = "Get all task for today")
    @GetMapping("/taskToday")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public List<Object[]> taskToday(){
        return taskService.taskToday();
    }

    @Operation(summary = "Get all task by user")
    @GetMapping("/findAllTaskByUser")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "barerAuth")
    public List<Object[]> findAllTaskByUser(){
        return taskService.findAllTaskByUser();
    }
}
