package com.kasiyanov.spaceport.template.parameterExtractor;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.parametersModel.NumberOfGuns;
import com.kasiyanov.spaceport.shipModel.parametersModel.Parameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CruiserParameterExtractor extends WarriorParameterExtractor {

    public Integer getNumberOfGuns(InputDto inputDto) {
        Integer numberOfGuns = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof NumberOfGuns) {
                numberOfGuns = ((NumberOfGuns) element).getNumberOfGuns();
                break;
            }
        }
        return numberOfGuns;
    }
}
