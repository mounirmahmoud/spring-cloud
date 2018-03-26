package com.sunshine.quote.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by fanida on 18-03-23.
 */

@Entity
public class Quote implements Serializable {

    @Id
    @GeneratedValue
    private  Long id;

    private String description;

    public Quote () {
    }

    public Quote (String description) {
        this.description = description;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }
}
