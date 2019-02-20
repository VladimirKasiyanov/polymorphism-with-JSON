package com.kasiyanov.spaceport.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Support extends Spaceship {

    public String colour;

    public Support(String name, String flueType, Integer flue, Integer armor, String colour) {
        super(name, flueType, flue, armor);
        this.colour = colour;
    }
}
