package com.ankit;

import com.ankit.beans.Vehicle;
import com.ankit.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle =  new Vehicle();
        vehicle.setName("Car");
        System.out.println("Vehicle name"+vehicle.getName());


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring context is:"+vehicle1.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from Spring context is: -"+hello);

        Integer number = context.getBean(Integer.class);
        System.out.println("Integer value from Spring context is:"+number);
    }
}