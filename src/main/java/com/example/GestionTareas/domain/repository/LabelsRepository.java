package com.example.GestionTareas.domain.repository;

import com.example.GestionTareas.persistence.entity.Labels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;

@Repository
public interface LabelsRepository extends JpaRepository<Labels, Integer> {


    // Querys ejemplos

    @Query(value = "SELECT e.*, COUNT(te.tarea_id) AS cantidad_tareas " +
            "FROM Etiquetas e " +
            "LEFT JOIN Tareas_Etiquetas te ON e.id = te.etiqueta_id " +
            "GROUP BY e.id", nativeQuery = true)
    List<Object[]> findLabelOne();


    @Query(value ="SELECT * FROM Etiquetas ORDER BY nombre DESC;", nativeQuery = true )
    List<Object[]>findOrden();

}
