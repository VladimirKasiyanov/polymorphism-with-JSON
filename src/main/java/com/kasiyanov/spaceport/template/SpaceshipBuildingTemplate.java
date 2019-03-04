package com.kasiyanov.spaceport.template;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.Spaceship;

public abstract class SpaceshipBuildingTemplate {

    private Spaceship spaceship;

    public Spaceship buildSpaceship(InputDto inputDto) {
        setSpaceshipType(inputDto);
        spaceship = setSpaceshipParameters(inputDto, spaceship);
        return spaceship;
    }

    private void setSpaceshipType(InputDto inputDto) {
        spaceship = inputDto.getTypeOfSpaceship();
    }

    public abstract Spaceship setSpaceshipParameters(InputDto inputDto, Spaceship spaceship);

}
