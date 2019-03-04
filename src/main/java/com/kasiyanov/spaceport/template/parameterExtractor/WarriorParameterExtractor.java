package com.kasiyanov.spaceport.template.parameterExtractor;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.parametersModel.Damage;
import com.kasiyanov.spaceport.shipModel.parametersModel.Parameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WarriorParameterExtractor extends ShipParameterExtractor {

    public Integer getDamageOfWarrior(InputDto inputDto) {
        Integer damage = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof Damage) {
                damage = ((Damage) element).getDamage();
                break;
            }
        }
        return damage;
    }
}
