package com.kasiyanov.spaceport.shipModel;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeathStar extends Warrior {

    private Integer maxFighterCapacity;

    @Builder
    public DeathStar(String name, String flueType, Integer flue, Integer armor,
                     Integer damage, Integer maxFighterCapacity) {
        super(name, flueType, flue, armor, damage);
        this.maxFighterCapacity = maxFighterCapacity;
    }
}
