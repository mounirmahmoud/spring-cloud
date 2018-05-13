package com.sunshine.vehicle.controller;

import com.sunshine.vehicle.entity.VehicleMake;
import com.sunshine.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Created by fanida on 18-04-09.
 */

@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping(path = "/makes")
    public List<VehicleMake>  makes(){
        List<VehicleMake> vehicleMakeList = vehicleService.getMakes();
        return vehicleMakeList;
    }

    @GetMapping(path = "/makes/1")
    public Optional<VehicleMake>  make(){
        Optional<VehicleMake> vehicleMakeList = vehicleService.getMake();
        return vehicleMakeList;
    }
}
