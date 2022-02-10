package com.greenfox.backend.controllers;

import com.greenfox.backend.services.DoublingServiceImpl;
import com.greenfox.backend.services.LogServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(DoublingController.class)
class DoublingControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mvc;

    @MockBean
    DoublingServiceImpl doublingService;

    @MockBean
    LogServiceImpl logService;


    @Test
    public void get_error() throws Exception {
        mvc.perform(get("/doubling")).andExpect(status().isOk());
    }

    @Test
    public void get_double_of_10() throws Exception {
        int received = 10;
        int result = 20;

        mvc.perform(get("/doubling?input=10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("received").isNumber())
                .andExpect(jsonPath("$.result").isNumber());
    }
}