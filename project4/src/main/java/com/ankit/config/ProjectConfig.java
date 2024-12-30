package com.ankit.config;

import com.ankit.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean(name = "hondaVehicle")
    Vehicle vehicle1(){
        var veh  = new Vehicle();
        veh.setName("honda");
        return veh;
    }
    @Bean(value = "audiVehicle")
    Vehicle vehicle2(){
        var veh  = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Primary
    @Bean("ferrariVehicle")
    Vehicle vehicle3(){
        var veh  = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
}
