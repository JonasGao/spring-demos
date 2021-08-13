package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MyController {

    @Value("${msg}")
    private String message;

    @Value("${other-msg}")
    private String otherMessage;

    @GetMapping("/hello")
    public String[] index() {
        return new String[]{message, otherMessage};
    }
}
