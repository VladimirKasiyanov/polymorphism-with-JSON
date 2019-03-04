package com.kasiyanov.spaceport.shipModel;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Fighter extends Warrior {

    private Integer flightSpeed;

    @Builder
    public Fighter(String name, String flueType, Integer flue, Integer armor, Integer damage, Integer flightSpeed) {
        super(name, flueType, flue, armor, damage);
        this.flightSpeed = flightSpeed;
    }
}
