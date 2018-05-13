package com.sunshine.vehicle.commun;

import com.sunshine.vehicle.service.VehicleService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fanida on 2018-05-12.
 */

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnBean
    //@ConditionalOnMissingBean // Si le bean n est pas present
    public VehicleService  vehicleService(){
        return new VehicleService("AppConfig");
    }
}
