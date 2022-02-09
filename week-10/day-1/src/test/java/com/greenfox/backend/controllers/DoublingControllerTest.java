package com.greenfox.backend.controllers;

import com.greenfox.backend.services.DoublingServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class DoublingControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private DoublingServiceImpl doublingService;

    @Test
    public void get_error() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/doubling")).andExpect(status().isOk());
    }

    @Test
    public void get_double_of_10() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/doubling").param("input", "10"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) MockMvcResultMatchers.jsonPath("received", "10"))
                .andExpect((ResultMatcher) MockMvcResultMatchers.jsonPath("result", "20"));
    }
}