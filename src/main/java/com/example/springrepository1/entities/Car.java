package com.example.springrepository1.entities;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String modelName;

    private String serialNumber;

    private double currentPrise;

    public Car(){
    }

    public Car(String modelName, String serialNumber, double currentPrise) {
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrise = currentPrise;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getCurrentPrise() {
        return currentPrise;
    }

    public void setCurrentPrise(double currentPrise) {
        this.currentPrise = currentPrise;
    }
}
