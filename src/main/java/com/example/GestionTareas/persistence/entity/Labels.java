package com.example.GestionTareas.persistence.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Etiquetas")
public class Labels {

    @Id
    @Column(name= "id")
    private int IdLabel;

    @Column (name = "nombre", length = 100)
    private String Name;

//Relacion muchos a muchos
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL )
    @JoinTable(
            name = "Tareas_Etiquetas", joinColumns = @JoinColumn(name ="etiqueta_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name ="tarea_id", referencedColumnName = "id")

    )
    private List<Task>tasks;

    public Labels() {
    }

    public Labels(int idLabel, String name, List<Task> tasks) {
        IdLabel = idLabel;
        Name = name;
        this.tasks = tasks;
    }

    public int getIdLabel() {
        return IdLabel;
    }

    public void setIdLabel(int idLabel) {
        IdLabel = idLabel;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
