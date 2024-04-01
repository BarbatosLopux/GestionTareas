package com.example.GestionTareas.persistence.DTO;

import java.util.Date;

public class TaskDTO {

        private int IdTask;
        private String Title;
        private String Description;
        private Date ExpirationDate;
        private String state;

    public TaskDTO(int idTask, String title, String description, Date expirationDate, String state) {
        IdTask = idTask;
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

    @Override
    public String toString() {
        return "TaskDTO{" +
                "IdTask=" + IdTask +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                ", ExpirationDate=" + ExpirationDate +
                ", state='" + state + '\'' +
                '}';
    }
}

