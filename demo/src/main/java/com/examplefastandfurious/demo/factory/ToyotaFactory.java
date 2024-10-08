package com.examplefastandfurious.demo.factory;

import com.examplefastandfurious.demo.model.Chasis;
import com.examplefastandfurious.demo.model.Cojineria;
import com.examplefastandfurious.demo.model.Motor;

public class ToyotaFactory extends  AbstractFactory {
    @Override
    public Chasis createChasis(int ejes, String tipoTransmision) {
        return new Chasis(ejes, "TOY-CH-001", tipoTransmision);
    }

    @Override
    public Motor createMotor(int potenciaMaxima, String tecnologia) {
        return new Motor(potenciaMaxima, "TOY-MOT-001", tecnologia);
    }

    @Override
    public Cojineria createCojineria(String material) {
        return new Cojineria("TOY-COJ-001", material);
    }
}


