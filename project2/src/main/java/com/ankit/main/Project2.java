package com.ankit.main;

import com.ankit.beans.Vehicle;
import com.ankit.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from Spring context is:"+vehicle1.getName());

    }
}