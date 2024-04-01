package com.example.GestionTareas.persistence.DTO;

public class LabelsDTO {
    private int IdLabel;
    private String Name;


    public LabelsDTO(int idLabel, String name) {
        IdLabel = idLabel;
        Name = name;
    }

    public LabelsDTO() {
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

    @Override
    public String toString() {
        return "LabelsDTO{" +
                "IdLabel=" + IdLabel +
                ", Name='" + Name + '\'' +
                '}';
    }



}
