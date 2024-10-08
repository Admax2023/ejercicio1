package com.examplefastandfurious.demo.model;

public class Cojineria {
    private String numeroPieza; // Número de pieza
    private String material; // Material base de fabricación (cuero, tela, sintético)

    public Cojineria(String numeroPieza, String material) {
        this.numeroPieza = numeroPieza;
        this.material = material;
    }

    // Getters y método toString
    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Cojineria{" +
                "numeroPieza='" + numeroPieza + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

}
