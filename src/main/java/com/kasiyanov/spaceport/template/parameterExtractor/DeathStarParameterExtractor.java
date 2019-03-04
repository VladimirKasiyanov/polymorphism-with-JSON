package com.kasiyanov.spaceport.template.parameterExtractor;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.parametersModel.MaxFighterCapacity;
import com.kasiyanov.spaceport.shipModel.parametersModel.Parameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeathStarParameterExtractor extends WarriorParameterExtractor {

    public Integer getMaxFighterCapacityOfDeathStar(InputDto inputDto) {
        Integer maxFighterCapacity = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof MaxFighterCapacity) {
                maxFighterCapacity = ((MaxFighterCapacity) element).getMaxFighterCapacity();
                break;
            }
        }
        return maxFighterCapacity;
    }
}
