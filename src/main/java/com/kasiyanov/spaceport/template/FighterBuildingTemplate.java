package com.kasiyanov.spaceport.template;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.Fighter;
import com.kasiyanov.spaceport.shipModel.Spaceship;
import com.kasiyanov.spaceport.template.parameterExtractor.FighterParameterExtractor;

public class FighterBuildingTemplate extends SpaceshipBuildingTemplate {

    @Override
    public Spaceship setSpaceshipParameters(InputDto inputDto, Spaceship spaceship) {
        FighterParameterExtractor extractor = new FighterParameterExtractor();

        return Fighter.builder()
                .name(extractor.getNameOfSpaceship(inputDto))
                .flueType(extractor.getFlueTypeOfSpaceship(inputDto))
                .flue(extractor.getFlueOfSpaceship(inputDto))
                .armor(extractor.getArmorOfSpaceship(inputDto))
                .damage(extractor.getDamageOfWarrior(inputDto))
                .flightSpeed(extractor.getFlightSpeedOfFighter(inputDto))
                .build();
    }
}
