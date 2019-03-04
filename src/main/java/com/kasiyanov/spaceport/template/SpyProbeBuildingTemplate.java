package com.kasiyanov.spaceport.template;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.Spaceship;
import com.kasiyanov.spaceport.shipModel.SpyProbe;
import com.kasiyanov.spaceport.template.parameterExtractor.SpyProbeParameterExtractor;

public class SpyProbeBuildingTemplate extends SpaceshipBuildingTemplate {

    @Override
    public Spaceship setSpaceshipParameters(InputDto inputDto, Spaceship spaceship) {
        SpyProbeParameterExtractor extractor = new SpyProbeParameterExtractor();

        return SpyProbe.builder()
                .name(extractor.getNameOfSpaceship(inputDto))
                .flueType(extractor.getFlueTypeOfSpaceship(inputDto))
                .flue(extractor.getFlueOfSpaceship(inputDto))
                .armor(extractor.getArmorOfSpaceship(inputDto))
                .colour(extractor.getColourOfSupport(inputDto))
                .scanSensor(extractor.getScanSensorOfSpyProbe(inputDto))
                .build();
    }
}
