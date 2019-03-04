package com.kasiyanov.spaceport.template;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.DeathStar;
import com.kasiyanov.spaceport.shipModel.Spaceship;
import com.kasiyanov.spaceport.template.parameterExtractor.DeathStarParameterExtractor;

public class DeathStarBuildingTemplate extends SpaceshipBuildingTemplate {

    @Override
    public Spaceship setSpaceshipParameters(InputDto inputDto, Spaceship spaceship) {
        DeathStarParameterExtractor extractor = new DeathStarParameterExtractor();

        return DeathStar.builder()
                .name(extractor.getNameOfSpaceship(inputDto))
                .flueType(extractor.getFlueTypeOfSpaceship(inputDto))
                .flue(extractor.getFlueOfSpaceship(inputDto))
                .armor(extractor.getArmorOfSpaceship(inputDto))
                .damage(extractor.getDamageOfWarrior(inputDto))
                .maxFighterCapacity(extractor.getMaxFighterCapacityOfDeathStar(inputDto))
                .build();
    }
}
