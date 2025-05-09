package com.centime.greetingservice.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    private final Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping
    public ResponseEntity<String> greet() {
        logger.info("Received greeting request");
        return ResponseEntity.ok("Hello");
    }
}
