package com.examplefastandfurious.demo.controller;

import com.examplefastandfurious.demo.dto.ChasisRequest;
import com.examplefastandfurious.demo.dto.CojineriaRequest;
import com.examplefastandfurious.demo.dto.MotorRequest;
import com.examplefastandfurious.demo.dto.VehiculoRequest;
import com.examplefastandfurious.demo.model.Vehiculo;
import com.examplefastandfurious.demo.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {


    @Autowired
    private VehiculoService vehiculoService;

    @PostMapping("/ensamblar")
    public ResponseEntity<Vehiculo> ensamblarVehiculo(@RequestBody VehiculoRequest vehiculoRequest) {

        String marca = vehiculoRequest.getMarca();
        String color = vehiculoRequest.getColor();
        int ejes = vehiculoRequest.getChasis().getEjes();
        String tipoTransmision = vehiculoRequest.getChasis().getTipoTransmision();
        int potenciaMaxima = vehiculoRequest.getMotor().getPotenciaMaxima();
        String tecnologia = vehiculoRequest.getMotor().getTecnologia();
        String materialTapiceria = vehiculoRequest.getCojineria().getMaterial();

        // Ensamblar el vehículo
        Vehiculo vehiculo = vehiculoService.ensamblarVehiculo(marca, color, ejes, tipoTransmision, potenciaMaxima, tecnologia, materialTapiceria);



        return ResponseEntity.ok(vehiculo);


    }

    @GetMapping("/todos") // Endpoint para obtener todos los vehículos
    public ResponseEntity<List<Vehiculo>> obtenerTodosLosVehiculos() {
        List<Vehiculo> vehiculos = vehiculoService.obtenerTodosLosVehiculos();
        return ResponseEntity.ok(vehiculos); // Devuelve la lista de vehículos
    }
}

