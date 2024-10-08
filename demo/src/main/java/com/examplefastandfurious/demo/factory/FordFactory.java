package com.examplefastandfurious.demo.factory;

import com.examplefastandfurious.demo.model.Chasis;
import com.examplefastandfurious.demo.model.Cojineria;
import com.examplefastandfurious.demo.model.Motor;

public class FordFactory  extends  AbstractFactory{

    @Override
    public Chasis createChasis(int ejes, String tipoTransmision) {
        return new Chasis(ejes, "FORD-CH-001", tipoTransmision);
    }

    @Override
    public Motor createMotor(int potenciaMaxima, String tecnologia) {
        return new Motor(potenciaMaxima, "FORD-MOT-001", tecnologia);
    }

    @Override
    public Cojineria createCojineria(String material) {
        return new Cojineria("FORD-COJ-001", material);
    }
}
