package com.example.GestionTareas.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "Usuarios")
public class User {

    @Id
    @Column (name = "id")
    private int IdUser;

    @Column(name= "nombre", length = 255)
    private String Name;


    @Column(name = "correo_electronico",length = 255, nullable = false)
    private String Email;

    @Column(name = "contrasena", length = 255, nullable = false)
    private String password;

    // Relaciones Uno a muchos
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks;

    private String token;


    public User() {
    }

    public User(int idUser, String name, String email, String password, List<Task> tasks) {
        IdUser = idUser;
        Name = name;
        Email = email;
        this.password = password;
        this.tasks = tasks;
    }

    public User(String name, String password, String token) {
        Name = name;
        this.password = password;
        this.token = token;
    }

    public int getIdUser() {
        return IdUser;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
