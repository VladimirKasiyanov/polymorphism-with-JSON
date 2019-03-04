package com.kasiyanov.spaceport.template;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.Spaceship;
import com.kasiyanov.spaceport.shipModel.Transport;
import com.kasiyanov.spaceport.shipModel.parametersModel.Parameter;
import com.kasiyanov.spaceport.template.parameterExtractor.TransportParameterExtractor;

import java.util.ArrayList;
import java.util.List;

public class TransportBuildingTemplate extends SpaceshipBuildingTemplate {

    @Override
    public Spaceship setSpaceshipParameters(InputDto inputDto, Spaceship spaceship) {
        TransportParameterExtractor extractor = new TransportParameterExtractor();
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        return Transport.builder()
                .name(extractor.getNameOfSpaceship(inputDto))
                .flueType(extractor.getFlueTypeOfSpaceship(inputDto))
                .flue(extractor.getFlueOfSpaceship(inputDto))
                .armor(extractor.getArmorOfSpaceship(inputDto))
                .colour(extractor.getColourOfSupport(inputDto))
                .capacity(extractor.getCapacityOfTransport(inputDto))
                .build();
    }
}
