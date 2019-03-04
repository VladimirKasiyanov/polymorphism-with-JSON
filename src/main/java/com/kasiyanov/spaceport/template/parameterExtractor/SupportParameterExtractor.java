package com.kasiyanov.spaceport.template.parameterExtractor;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.parametersModel.Colour;
import com.kasiyanov.spaceport.shipModel.parametersModel.Parameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SupportParameterExtractor extends ShipParameterExtractor {

    public String getColourOfSupport(InputDto inputDto) {
        String colour = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof Colour) {
                colour = ((Colour) element).getColour();
                break;
            }
        }
        return colour;
    }
}
