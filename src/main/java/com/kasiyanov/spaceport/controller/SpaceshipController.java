package com.kasiyanov.spaceport.controller;

import com.kasiyanov.spaceport.dto.InputDto;
import com.kasiyanov.spaceport.service.SpaceshipService;
import com.kasiyanov.spaceport.shipModel.Spaceship;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SpaceshipController {

    private final SpaceshipService spaceshipService;

    @PostMapping(value = "/dto/post", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Spaceship buildSpaceship(@RequestBody InputDto inputDto) {
        return spaceshipService.buildSpaceship(inputDto);
    }
}
