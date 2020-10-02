package com.fabiogaiera.prometheus.controller;

import com.fabiogaiera.prometheus.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest {

    private MockMvc mockMvc;

    private ObjectMapper objectMapper;

    @Test
    public void testNewPerson() throws Exception {

        Person person = new Person("Orlando", "Pugliese");
        mockMvc.perform(post("/persons/new")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(person)))
                .andExpect(status().isOk());

    }

    @Autowired
    public void setMockMvc(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Autowired
    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

}