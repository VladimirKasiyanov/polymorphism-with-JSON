package com.kasiyanov.spaceport.template.parameterExtractor;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.parametersModel.FlightSpeed;
import com.kasiyanov.spaceport.shipModel.parametersModel.Parameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FighterParameterExtractor extends WarriorParameterExtractor {

    public Integer getFlightSpeedOfFighter(InputDto inputDto) {
        Integer flightSpeed = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof FlightSpeed) {
                flightSpeed = ((FlightSpeed) element).getFlightSpeed();
                break;
            }
        }
        return flightSpeed;
    }
}
