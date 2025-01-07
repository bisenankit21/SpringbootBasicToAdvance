package com.ankit.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize(){
        this.name = "Honda";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying vehicle bean");
    }

    public void printHello(){
        System.out.println("Printing Hello from component vehicle bean ");
    }
}
