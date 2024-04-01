package com.example.GestionTareas.web.controller;


import com.example.GestionTareas.domain.service.LabelsService;
import com.example.GestionTareas.persistence.entity.Labels;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Labels")
@Tag(name="Labels Resources")
public class LabelsController {

    @Autowired
    LabelsService labelsService;


@Operation(summary = "Get all labels for the application ")
@GetMapping("/findAll")
@PreAuthorize("hasRole('ADMIN')")
@SecurityRequirement(name = "bearerAuth")
public List<Labels> findAll(){
return labelsService.findAll();
}

@Operation(summary = "Find a label just for one id")
@GetMapping("/findLabelOne")
@PreAuthorize("hasRole('ADMIN')")
@SecurityRequirement(name = "bearerAuth")
public List<Object[]> findLabelOne() {
    return labelsService.findLabelOne();
}



@Operation(summary = "Find labels in Order")
@GetMapping("/findOrder")
@PreAuthorize("hasRole('ADMIN')")
@SecurityRequirement(name = "bearerAuth")
public List<Object[]>findOrder(){
    return labelsService.findOrden();
}


}
