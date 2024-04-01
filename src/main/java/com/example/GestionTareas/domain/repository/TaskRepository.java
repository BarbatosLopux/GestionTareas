package com.example.GestionTareas.domain.repository;

import com.example.GestionTareas.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository <Task, Integer> {

    //Querys Ejemplos

    @Query(value = "SELECT * FROM Tareas WHERE fecha_vencimiento > CURDATE();",nativeQuery = true)
    List<Object[]> taskToday();


    @Query(value = "SELECT t.*, u.nombre AS nombre_usuario " +
            "FROM Tareas t " +
            "INNER JOIN Usuarios u ON t.usuario_id = u.id", nativeQuery = true)
    List<Object[]> findAllTaskByUser();
}
