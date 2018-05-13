package com.sunshine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class WebVehicleServiceApplication {
    
    public static void main (String[] args) {
        SpringApplication.run(WebVehicleServiceApplication.class, args);
    }
}
