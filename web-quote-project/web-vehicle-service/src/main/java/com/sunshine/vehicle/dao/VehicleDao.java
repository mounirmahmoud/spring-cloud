package com.sunshine.vehicle.dao;

import com.sunshine.vehicle.entity.VehicleMake;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by fanida on 18-04-09.
 */


public interface VehicleDao extends MongoRepository<VehicleMake, Long> {

}
