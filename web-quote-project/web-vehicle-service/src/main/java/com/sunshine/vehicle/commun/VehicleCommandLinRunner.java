package com.sunshine.vehicle.commun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by fanida on 2018-05-12.
 */

@Component
public class VehicleCommandLinRunner implements CommandLineRunner {

    @Override
    public void run (String... strings) throws Exception {
        System.out.print("Start ....");
    }
}
