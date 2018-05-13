package com.sunshine.vehicle.commun;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by fanida on 2018-05-13.
 */

@ConfigurationProperties("vehicle")
public class VehicleProperties {

    /* prefix */
    private String prefix= "hello mounir";

    /* sufix */
    private String sufix= "!";

    public String getPrefix () {
        return prefix;
    }

    public void setPrefix (String prefix) {
        this.prefix = prefix;
    }

    public String getSufix () {
        return sufix;
    }

    public void setSufix (String sufix) {
        this.sufix = sufix;
    }
}
