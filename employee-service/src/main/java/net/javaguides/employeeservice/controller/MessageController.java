package net.javaguides.employeeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageController {

    // message controller is nothing but a spring bean
    // at refresh scope annotation will force this spring bean to reload the configuration

    // in order to read a value from properties file
    @Value("${spring.boot.message}")
    private String message;

    @GetMapping("/users/message")
    public String message() {
        return message;
    }


}
