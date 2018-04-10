package com.sunshine.vehicle.controller;

import com.sunshine.vehicle.dao.VehicleMakeDao;
import com.sunshine.vehicle.entity.VehicleMake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fanida on 18-04-09.
 */

@RestController
public class VehicleController {

    @Autowired
    VehicleMakeDao vehicleMakeDao;

    @GetMapping(path = "/makes")
    public String makes(){
        List<VehicleMake> vehicleMakeList = vehicleMakeDao.findAll();

        return "makes list";
    }
}
