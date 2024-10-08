package com.examplefastandfurious.demo.factory;

import com.examplefastandfurious.demo.model.Chasis;
import com.examplefastandfurious.demo.model.Cojineria;
import com.examplefastandfurious.demo.model.Motor;

public abstract class AbstractFactory {
    public abstract  Chasis createChasis(int ejes, String tipoTransmision);
    public abstract Motor createMotor(int potenciaMaxima, String tecnologia);
    public abstract Cojineria createCojineria(String material);
}
