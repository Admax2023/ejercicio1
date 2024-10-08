package com.examplefastandfurious.demo.dto;

public class MotorRequest {
    private int potenciaMaxima;
    private String tecnologia;

    // Getters y setters
    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

}
