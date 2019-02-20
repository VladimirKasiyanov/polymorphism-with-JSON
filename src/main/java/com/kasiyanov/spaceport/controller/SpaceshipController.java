package com.kasiyanov.spaceport.controller;

import com.kasiyanov.spaceport.model.Spaceship;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceshipController {

    @PostMapping(value = "/post", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Spaceship buildSpaceship(@RequestBody Spaceship spaceship) {
        return spaceship;
    }
}
