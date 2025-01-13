package com.ankit.main;

import com.ankit.beans.Person;
import com.ankit.beans.Vehicle;
import com.ankit.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
       /* Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleService().playMusic();
        vehicle.getVehicleService().rotateTyres();*/
        person.getVehicle().getVehicleService().playMusic();
        person.getVehicle().getVehicleService().rotateTyres();

    }
}