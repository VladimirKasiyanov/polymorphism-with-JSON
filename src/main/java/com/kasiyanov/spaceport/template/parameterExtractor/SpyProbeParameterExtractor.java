package com.kasiyanov.spaceport.template.parameterExtractor;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.parametersModel.Parameter;
import com.kasiyanov.spaceport.shipModel.parametersModel.ScanSensor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpyProbeParameterExtractor extends SupportParameterExtractor {

    public String getScanSensorOfSpyProbe(InputDto inputDto) {
        String scanSensor = null;
        List<Parameter> parametersList = new ArrayList<>(inputDto.getParameters());

        Iterator<Parameter> iterator = parametersList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof ScanSensor) {
                scanSensor = ((ScanSensor) element).getScanSensor();
                break;
            }
        }
        return scanSensor;
    }
}
