package com.example.GestionTareas.domain.serviceImpl;

import com.example.GestionTareas.domain.repository.LabelsRepository;
import com.example.GestionTareas.domain.service.LabelsService;
import com.example.GestionTareas.persistence.entity.Labels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LabelsServiceImpl implements LabelsService {

    @Autowired
    LabelsRepository repository;
    @Override
    public List<Labels> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Object[]> findLabelOne() {
        return repository.findLabelOne();

    }
    @Override
    public List<Object[]>findOrden(){
        return repository.findOrden();
    }

}
