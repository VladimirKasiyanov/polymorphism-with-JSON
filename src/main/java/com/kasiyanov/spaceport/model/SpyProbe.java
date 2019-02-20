package com.kasiyanov.spaceport.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SpyProbe extends Support {

    private String scanSensor;

    public SpyProbe(String name, String flueType, Integer flue, Integer armor,
                    String colour, String scanSensor) {
        super(name, flueType, flue, armor, colour);
        this.scanSensor = scanSensor;
    }
}
