package com.ankit.impl;

import com.ankit.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "Rotate using MichelinTyres";
    }
}
