package com.kasiyanov.spaceport.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Transport extends Support {

    private Integer capacity;

    public Transport(String name, String flueType, Integer flue, Integer armor,
                     String colour, Integer capacity) {
        super(name, flueType, flue, armor, colour);
        this.capacity = capacity;
    }
}
