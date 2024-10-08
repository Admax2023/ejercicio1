package com.examplefastandfurious.demo.model;
import java.time.LocalDate;


public class Vehiculo {
    private String marca;
    private String color;
    private Chasis chasis;
    private Motor motor;
    private Cojineria cojineria;
    private LocalDate fechaEnsamblaje;
    private String numeroEnsamblaje;

    public Vehiculo(String marca, String color, Chasis chasis, Motor motor, Cojineria cojineria,
                    LocalDate fechaEnsamblaje, String numeroEnsamblaje) {
        this.marca = marca;
        this.color = color;
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    // Getters y método toString
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public Cojineria getCojineria() {
        return cojineria;
    }

    public LocalDate getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public String getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", chasis=" + chasis +
                ", motor=" + motor +
                ", cojineria=" + cojineria +
                ", fechaEnsamblaje=" + fechaEnsamblaje +
                ", numeroEnsamblaje='" + numeroEnsamblaje + '\'' +
                '}';
    }

}
