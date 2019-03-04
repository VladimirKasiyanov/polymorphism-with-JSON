package com.kasiyanov.spaceport.service;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.shipModel.Cruiser;
import com.kasiyanov.spaceport.shipModel.DeathStar;
import com.kasiyanov.spaceport.shipModel.Spaceship;
import com.kasiyanov.spaceport.shipModel.SpyProbe;
import com.kasiyanov.spaceport.shipModel.Transport;
import com.kasiyanov.spaceport.template.CruiserBuildingTemplate;
import com.kasiyanov.spaceport.template.DeathStarBuildingTemplate;
import com.kasiyanov.spaceport.template.FighterBuildingTemplate;
import com.kasiyanov.spaceport.template.SpaceshipBuildingTemplate;
import com.kasiyanov.spaceport.template.SpyProbeBuildingTemplate;
import com.kasiyanov.spaceport.template.TransportBuildingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SpaceshipService {

    public Spaceship buildSpaceship(@RequestBody InputDto inputDto) {
        SpaceshipBuildingTemplate spaceshipBuildingTemplate = setCurrentSpaceshipType(inputDto);
        return spaceshipBuildingTemplate.buildSpaceship(inputDto);
    }

    private SpaceshipBuildingTemplate setCurrentSpaceshipType(InputDto inputDto) {
        SpaceshipBuildingTemplate spaceshipBuildingTemplate;
        if (inputDto.getTypeOfSpaceship() instanceof Transport) {
            spaceshipBuildingTemplate = new TransportBuildingTemplate();
        } else if (inputDto.getTypeOfSpaceship() instanceof SpyProbe) {
            spaceshipBuildingTemplate = new SpyProbeBuildingTemplate();
        } else if (inputDto.getTypeOfSpaceship() instanceof Cruiser) {
            spaceshipBuildingTemplate = new CruiserBuildingTemplate();
        } else if (inputDto.getTypeOfSpaceship() instanceof DeathStar) {
            spaceshipBuildingTemplate = new DeathStarBuildingTemplate();
        } else {
            spaceshipBuildingTemplate = new FighterBuildingTemplate();
        }
        return spaceshipBuildingTemplate;
    }
}
