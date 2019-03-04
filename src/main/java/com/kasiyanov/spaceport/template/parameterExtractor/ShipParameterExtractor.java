package com.kasiyanov.spaceport.template.parameterExtractor;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.parametersModel.Armor;
import com.kasiyanov.spaceport.shipModel.parametersModel.Flue;
import com.kasiyanov.spaceport.shipModel.parametersModel.FlueType;
import com.kasiyanov.spaceport.shipModel.parametersModel.NameOfSpaceship;
import com.kasiyanov.spaceport.shipModel.parametersModel.Parameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShipParameterExtractor {

    public String getNameOfSpaceship(InputDto inputDto) {
        String name = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof NameOfSpaceship) {
                name = ((NameOfSpaceship) element).getName();
                break;
            }
        }
        return name;
    }

    public String getFlueTypeOfSpaceship(InputDto inputDto) {
        String flueType = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof FlueType) {
                flueType = ((FlueType) element).getFlueType();
                break;
            }
        }
        return flueType;
    }

    public Integer getFlueOfSpaceship(InputDto inputDto) {
        Integer flue = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof Flue) {
                flue = ((Flue) element).getFlue();
                break;
            }
        }
        return flue;
    }

    public Integer getArmorOfSpaceship(InputDto inputDto) {
        Integer armor = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof Armor) {
                armor = ((Armor) element).getArmor();
                break;
            }
        }
        return armor;
    }
}
