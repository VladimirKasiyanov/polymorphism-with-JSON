package com.kasiyanov.spaceport.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cruiser extends Warrior {

    private Integer numberOfGuns;

    public Cruiser(String name, String flueType, Integer flue, Integer armor,
                   Integer damage, Integer numberOfGuns) {
        super(name, flueType, flue, armor, damage);
        this.numberOfGuns = numberOfGuns;
    }
}
