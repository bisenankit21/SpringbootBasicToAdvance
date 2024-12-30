package com.ankit.config;

import com.ankit.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle(){
        var veh  = new Vehicle();
        veh.setName("honda");
        return veh;
    }

    @Bean
    String hello(){
        return "Hello World";
    }

    @Bean
    Integer number(){
        return 100;
    }
}
