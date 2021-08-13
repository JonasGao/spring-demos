package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Client client;

    public Controller(Client client) {
        this.client = client;
    }

    @RequestMapping(value = "/")
    public String home() {
        return client.home();
    }
}
