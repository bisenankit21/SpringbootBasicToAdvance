package com.ankit.main;

import com.ankit.beans.Vehicle;
import com.ankit.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring context is:"+vehicle1.getName());
        Vehicle vehicle2 = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring context is:"+vehicle2.getName());
        Vehicle vehicle3 = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring context is:"+vehicle3.getName());

    }
}