package com.example.lab1;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class TestingWebApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void createAddressBook() throws Exception {
        this.mockMvc.perform(get("/CreateBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Created AddressBook with ID: 1")));

        this.mockMvc.perform(get("/" + "CreateBuddy" + "?name=chris&ID=5418859")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Created Buddy chris With Id: 1")));

        this.mockMvc.perform(get("/" + "addBuddy" + "?name=1&ID=1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Added Buddy chris With Id: 1 To AddressBook Id: 1")));

        this.mockMvc.perform(get("/" + "removeBuddy" + "?AID=1&BID=1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Removed Buddy chris With Id: 1 From AddressBook Id: 1")));
    }
}
