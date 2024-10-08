package com.examplefastandfurious.demo.model;

public class Motor {
    private int potenciaMaxima; // Potencia máxima
    private String numeroPieza; // Número de pieza
    private String tecnologia; // Tecnología (eléctrico, térmico, híbrido)

    public Motor(int potenciaMaxima, String numeroPieza, String tecnologia) {
        this.potenciaMaxima = potenciaMaxima;
        this.numeroPieza = numeroPieza;
        this.tecnologia = tecnologia;
    }

    // Getters y método toString
    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potenciaMaxima=" + potenciaMaxima +
                ", numeroPieza='" + numeroPieza + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                '}';
    }
}
