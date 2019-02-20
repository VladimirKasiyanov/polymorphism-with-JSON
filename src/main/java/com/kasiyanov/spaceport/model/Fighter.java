package com.kasiyanov.spaceport.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Fighter extends Warrior {

    private Integer flightSpeed;

    public Fighter(String name, String flueType, Integer flue, Integer armor, Integer damage, Integer flightSpeed) {
        super(name, flueType, flue, armor, damage);
        this.flightSpeed = flightSpeed;
    }
}
