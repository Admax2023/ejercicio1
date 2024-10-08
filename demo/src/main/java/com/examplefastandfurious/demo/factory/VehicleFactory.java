package com.examplefastandfurious.demo.factory;

public class VehicleFactory {
    public static AbstractFactory getFactory(String marca) {
        switch (marca.toLowerCase()) {
            case "toyota":
                return new ToyotaFactory();
            case "ford":
                return new FordFactory();
            case "mazda":
                return new MazdaFactory();
            default:
                throw new IllegalArgumentException("Marca no soportada: " + marca);
        }
    }
}
