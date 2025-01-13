package com.ankit.service;

import com.ankit.interfaces.Speakers;
import com.ankit.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    @Autowired
    private Speakers speakers;
    private Tyres tyres;
    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void rotateTyres(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired   //Setter style of dependency injection
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
