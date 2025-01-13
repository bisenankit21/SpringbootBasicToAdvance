package com.ankit.beans;

import com.ankit.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {
    private String name ="Honda";
    private final VehicleService vehicleService;

    @Autowired  //used constructor style of dependency injection
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }
}
