package com.sunshine.vehicle.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by fanida on 18-04-09.
 */

@Document(collection = "VEHICLE-MAKE")
public class VehicleMake {

    @Id
    ObjectId databaseId;

    int id;

    Object make;

    @Indexed(unique = true)
    private String _document_;

    public ObjectId getDatabaseId () {
        return databaseId;
    }

    public void setDatabaseId (ObjectId databaseId) {
        this.databaseId = databaseId;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public Object getMake () {
        return make;
    }

    public void setMake (Object make) {
        this.make = make;
    }

    public String get_document_ () {
        return _document_;
    }

    public void set_document_ (String _document_) {
        this._document_ = _document_;
    }
}
