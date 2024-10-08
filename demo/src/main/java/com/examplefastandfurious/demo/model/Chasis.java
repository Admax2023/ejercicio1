package com.examplefastandfurious.demo.model;

public class Chasis {
    private int ejes; // Número de ejes
    private String numeroPieza; // Número de pieza
    private String tipoTransmision; // Tipo de transmisión (automática, mecánica)

    public Chasis(int ejes, String numeroPieza, String tipoTransmision) {
        this.ejes = ejes;
        this.numeroPieza = numeroPieza;
        this.tipoTransmision = tipoTransmision;
    }

    // Getters y método toString
    public int getEjes() {
        return ejes;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    @Override
    public String toString() {
        return "Chasis{" +
                "ejes=" + ejes +
                ", numeroPieza='" + numeroPieza + '\'' +
                ", tipoTransmision='" + tipoTransmision + '\'' +
                '}';
    }
}
