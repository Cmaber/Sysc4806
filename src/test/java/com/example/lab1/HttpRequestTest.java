package com.example.lab1;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Value;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @Value(value="${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void createAddressBook() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port +
                        "/" + "CreateBook",
                String.class)).contains("Created AddressBook with ID: 1");

        assertThat(this.restTemplate.getForObject("http://localhost:" + port +
                        "/" + "CreateBuddy" + "?name=chris&ID=5418859",
                String.class)).contains("Created Buddy chris With Id: 1");

        assertThat(this.restTemplate.getForObject("http://localhost:" + port +
                        "/" + "addBuddy" + "?name=1&ID=1",
                String.class)).contains("Added Buddy chris With Id: 1 To AddressBook Id: 1");

        assertThat(this.restTemplate.getForObject("http://localhost:" + port +
                        "/" + "removeBuddy" + "?AID=1&BID=1",
                String.class)).contains("Removed Buddy chris With Id: 1 From AddressBook Id: 1");
    }
}