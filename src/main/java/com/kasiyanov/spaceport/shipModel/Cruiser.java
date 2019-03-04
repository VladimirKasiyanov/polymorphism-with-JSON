package com.kasiyanov.spaceport.shipModel;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Cruiser extends Warrior {

    private Integer numberOfGuns;

    @Builder
    public Cruiser(String name, String flueType, Integer flue, Integer armor,
                   Integer damage, Integer numberOfGuns) {
        super(name, flueType, flue, armor, damage);
        this.numberOfGuns = numberOfGuns;
    }
}
