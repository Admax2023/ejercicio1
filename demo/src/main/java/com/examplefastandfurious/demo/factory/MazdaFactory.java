package com.examplefastandfurious.demo.factory;

import com.examplefastandfurious.demo.model.Chasis;
import com.examplefastandfurious.demo.model.Cojineria;
import com.examplefastandfurious.demo.model.Motor;

public class MazdaFactory extends  AbstractFactory {

    @Override
    public Chasis createChasis(int ejes, String tipoTransmision) {
        return new Chasis(ejes, "MAZ-CH-001", tipoTransmision);
    }

    @Override
    public Motor createMotor(int potenciaMaxima, String tecnologia) {
        return new Motor(potenciaMaxima, "MAZ-MOT-001", tecnologia);
    }

    @Override
    public Cojineria createCojineria(String material) {
        return new Cojineria("MAZ-COJ-001", material);
    }

}
