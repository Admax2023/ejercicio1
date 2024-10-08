package com.examplefastandfurious.demo.dto;

public class VehiculoRequest {

    private String marca;
    private String color;
    private ChasisRequest chasis;
    private MotorRequest motor;
    private CojineriaRequest cojineria;

    // Getters y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ChasisRequest getChasis() {
        return chasis;
    }

    public void setChasis(ChasisRequest chasis) {
        this.chasis = chasis;
    }

    public MotorRequest getMotor() {
        return motor;
    }

    public void setMotor(MotorRequest motor) {
        this.motor = motor;
    }

    public CojineriaRequest getCojineria() {
        return cojineria;
    }

    public void setCojineria(CojineriaRequest cojineria) {
        this.cojineria = cojineria;
    }

}
