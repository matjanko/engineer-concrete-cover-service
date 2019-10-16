package com.github.matjanko.engineer.concrete.cover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestMain {
    public static void main(String[] args) {
        SpringApplication.run(TestMain.class, args);
    }

    @RequestMapping(value = "/test-message")
    public String getTestMessage() {
        return "test message";
    }
}
