package com.kasiyanov.spaceport.template;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.Cruiser;
import com.kasiyanov.spaceport.shipModel.Spaceship;
import com.kasiyanov.spaceport.template.parameterExtractor.CruiserParameterExtractor;

public class CruiserBuildingTemplate extends SpaceshipBuildingTemplate {

    @Override
    public Spaceship setSpaceshipParameters(InputDto inputDto, Spaceship spaceship) {
        CruiserParameterExtractor extractor = new CruiserParameterExtractor();

        return Cruiser.builder()
                .name(extractor.getNameOfSpaceship(inputDto))
                .flueType(extractor.getFlueTypeOfSpaceship(inputDto))
                .flue(extractor.getFlueOfSpaceship(inputDto))
                .armor(extractor.getArmorOfSpaceship(inputDto))
                .damage(extractor.getDamageOfWarrior(inputDto))
                .numberOfGuns(extractor.getNumberOfGuns(inputDto))
                .build();
    }
}
