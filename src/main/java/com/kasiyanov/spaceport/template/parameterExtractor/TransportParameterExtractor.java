package com.kasiyanov.spaceport.template.parameterExtractor;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.parametersModel.Capacity;
import com.kasiyanov.spaceport.shipModel.parametersModel.Parameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TransportParameterExtractor extends SupportParameterExtractor {

    public Integer getCapacityOfTransport(InputDto inputDto) {
        Integer capacity = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof Capacity) {
                capacity = ((Capacity) element).getCapacity();
                break;
            }
        }
        return capacity;
    }
}
