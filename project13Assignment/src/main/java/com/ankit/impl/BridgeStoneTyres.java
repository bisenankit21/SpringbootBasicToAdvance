package com.ankit.impl;

import com.ankit.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {

        return " Rotate using BridgeStoneTyres";
    }
}
