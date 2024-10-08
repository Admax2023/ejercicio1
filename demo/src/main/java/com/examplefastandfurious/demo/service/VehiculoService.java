package com.examplefastandfurious.demo.service;

import com.examplefastandfurious.demo.factory.AbstractFactory;
import com.examplefastandfurious.demo.factory.VehicleFactory;
import com.examplefastandfurious.demo.model.Chasis;
import com.examplefastandfurious.demo.model.Cojineria;
import com.examplefastandfurious.demo.model.Motor;
import com.examplefastandfurious.demo.model.Vehiculo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class VehiculoService {

    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Vehiculo ensamblarVehiculo(String marca, String color, int ejes, String tipoTransmision,
                                      int potenciaMaxima, String tecnologia, String materialTapiceria) {
        // Obtener la fábrica correspondiente
        AbstractFactory factory = VehicleFactory.getFactory(marca);

        // Crear las partes del vehículo usando la fábrica
        Chasis chasis = factory.createChasis(ejes, tipoTransmision);
        Motor motor = factory.createMotor(potenciaMaxima, tecnologia);
        Cojineria cojineria = factory.createCojineria(materialTapiceria);

        // Generar número de ensamblaje único
        String numeroEnsamblaje = UUID.randomUUID().toString();

        // Crear el vehículo
        Vehiculo vehiculo = new Vehiculo(
                capitalize(marca),
                color,
                chasis,
                motor,
                cojineria,
                LocalDate.now(),
                numeroEnsamblaje
        );


        vehiculos.add(vehiculo);

        return vehiculo;

    }

    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return vehiculos; // Devuelve la lista de vehículos
    }




    // Método auxiliar para capitalizar la marca
    private String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
