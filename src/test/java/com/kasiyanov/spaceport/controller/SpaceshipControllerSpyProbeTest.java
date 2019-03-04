package com.kasiyanov.spaceport.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpaceshipControllerSpyProbeTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void init() {
        mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void checkBuildingSpyProbe() throws Exception {
        MockHttpServletRequestBuilder post = post("/dto/post")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{" +
                        "\"typeOfSpaceship\": " +
                        "{\"@class\": \".SpyProbe\"}, " +
                        "\"parameters\": " +
                        "[" +
                        "{" +
                        "\"@class\": \".NameOfSpaceship\", " +
                        "\"name\": \"SpyProbe\"" +
                        "}, " +
                        "{" +
                        "\"@class\": \".FlueType\", " +
                        "\"flueType\": \"diesel\"" +
                        "}, " +
                        "{" +
                        "\"@class\": \".Flue\", " +
                        "\"flue\": \"200\"" +
                        "}, " +
                        "{" +
                        "\"@class\": \".Armor\", " +
                        "\"armor\": \"50\"" +
                        "}, " +
                        "{" +
                        "\"@class\": \".Colour\", " +
                        "\"colour\": \"Black\"" +
                        "}, " +
                        "{" +
                        "\"@class\": \".ScanSensor\", " +
                        "\"scanSensor\": \"UV\"" +
                        "}" +
                        "]" +
                        "}");

        mockMvc.perform(post)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().json(
                        "{'@class':'.SpyProbe', " +
                                "'name':'SpyProbe', " +
                                "'flueType':'diesel', " +
                                "'flue':200, " +
                                "'armor':50, " +
                                "'colour':'Black', " +
                                "'scanSensor':'UV'" +
                                "}"));
    }
}