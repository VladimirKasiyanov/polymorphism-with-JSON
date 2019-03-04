package com.kasiyanov.spaceport.dto;

import com.kasiyanov.spaceport.shipModel.Spaceship;
import com.kasiyanov.spaceport.shipModel.parametersModel.Parameter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InputDto {

    private Spaceship typeOfSpaceship;
    private List<Parameter> parameters;
}
