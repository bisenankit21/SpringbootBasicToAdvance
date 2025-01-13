package com.ankit.impl;

import com.ankit.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound() {

        return "Play sound using SonySpeakers";
    }
}
