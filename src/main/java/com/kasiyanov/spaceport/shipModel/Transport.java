package com.kasiyanov.spaceport.shipModel;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Transport extends Support {

    private Integer capacity;

    @Builder
    public Transport(String name, String flueType, Integer flue, Integer armor,
                     String colour, Integer capacity) {
        super(name, flueType, flue, armor, colour);
        this.capacity = capacity;
    }
}
