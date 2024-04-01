package com.example.GestionTareas.persistence.entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "Tareas")
public class Task {

    @Id
    @Column(name="id")
    private int IdTask;

    // Ralacion Mucho a unos
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private User user;

    // Relaciones muchos a muchos
    @ManyToMany(mappedBy = "tasks")
    private List<Labels>label;
    //
    @Column(name = "titulo", length = 255)
    private String Title;

    @Column(name = "descripcion", length = 255)
    private String Description;

    @Column(name = "fecha_vencimiento")
    private Date ExpirationDate;

    @Column(name = "estado", length = 50, nullable = false)
    private String state;

    public Task() {
    }

    public Task(int idTask, User user, List<Labels> label, String title, String description, Date expirationDate, String state) {
        IdTask = idTask;
        this.user = user;
        this.label = label;
        Title = title;
        Description = description;
        ExpirationDate = expirationDate;
        this.state = state;
    }

    public int getIdTask() {
        return IdTask;
    }

    public void setIdTask(int idTask) {
        IdTask = idTask;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Labels> getLabel() {
        return label;
    }

    public void setLabel(List<Labels> label) {
        this.label = label;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
