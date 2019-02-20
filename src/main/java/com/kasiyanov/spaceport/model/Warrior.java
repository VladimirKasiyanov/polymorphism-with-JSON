package com.kasiyanov.spaceport.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Warrior extends Spaceship {

    public Integer damage;

    public Warrior(String name, String flueType, Integer flue, Integer armor, Integer damage) {
        super(name, flueType, flue, armor);
        this.damage = damage;
    }
}
