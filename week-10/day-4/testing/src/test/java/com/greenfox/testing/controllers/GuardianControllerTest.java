package com.greenfox.testing.controllers;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
class GuardianControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void translate_with_param() throws Exception {
        mockMvc.perform(get("/groot").param("message", "asd"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received").value("asd"))
                .andExpect(jsonPath("$.translated").value("I am Groot!"));
    }

    @Test
    void translate_with_empty_param() throws Exception {
        mockMvc.perform(get("/groot").param("message", ""))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("I am Groot!"));
    }

    @Test
    void translate_without_param() throws Exception {
        mockMvc.perform(get("/groot")).andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("I am Groot!"));
    }
}