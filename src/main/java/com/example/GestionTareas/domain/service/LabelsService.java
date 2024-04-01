package com.example.GestionTareas.domain.service;

import com.example.GestionTareas.persistence.entity.Labels;

import java.util.List;

public interface LabelsService {

    List<Labels> findAll();


    List<Object[]> findLabelOne();

    List<Object[]>findOrden();

}
