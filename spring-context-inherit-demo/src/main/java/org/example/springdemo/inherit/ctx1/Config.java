package org.example.springdemo.inherit.ctx1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Service3 service3() {
        return new Service3();
    }
}
