package com.kasiyanov.spaceport.shipModel;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SpyProbe extends Support {

    private String scanSensor;

    @Builder
    public SpyProbe(String name, String flueType, Integer flue, Integer armor,
                    String colour, String scanSensor) {
        super(name, flueType, flue, armor, colour);
        this.scanSensor = scanSensor;
    }
}
