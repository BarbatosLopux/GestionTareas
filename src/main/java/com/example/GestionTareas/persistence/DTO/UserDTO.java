package com.example.GestionTareas.persistence.DTO;

public class UserDTO {
    private int IdUser;
    private String Name;
    private String LastName;
    private String Email;
    private String password;

    public UserDTO() {
    }

    public UserDTO(int idUser, String name, String lastName, String email, String password) {
        this.IdUser = idUser;
        this.Name = name;
        this.LastName = lastName;
        this.Email = email;
        this.password = password;
    }

    public int getIdUser() {
        return IdUser;
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

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
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

    @Override
    public String toString() {
        return "UserDTO{" +
                "IdUser=" + IdUser +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
