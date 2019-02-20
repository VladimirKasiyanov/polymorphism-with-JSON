package com.kasiyanov.spaceport.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeathStar extends Warrior {

    private Integer maxFighterCapacity;

    public DeathStar(String name, String flueType, Integer flue, Integer armor,
                     Integer damage, Integer maxFighterCapacity) {
        super(name, flueType, flue, armor, damage);
        this.maxFighterCapacity = maxFighterCapacity;
    }
}
