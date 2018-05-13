package com.sunshine.vehicle.service;

import com.sunshine.vehicle.dao.VehicleDao;
import com.sunshine.vehicle.entity.VehicleMake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by fanida on 2018-05-12.
 */

@Service
public class VehicleService {


    @Autowired
    VehicleDao vehicleMakeDao;

    private  String id;

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public VehicleService (String id) {
        this.setId(id);
        System.out.println("creation with"  + id);
    }

    public List<VehicleMake> getMakes (){
            System.out.println(this.id);
            List<VehicleMake> vehicleList = vehicleMakeDao.findAll();
            return vehicleList;
    }

    public Optional<VehicleMake> getMake(){
        Optional<VehicleMake> make = vehicleMakeDao.findById(1L);
        return make;
    }

}
