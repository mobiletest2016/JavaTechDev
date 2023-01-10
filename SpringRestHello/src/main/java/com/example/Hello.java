package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {
    @GetMapping("/hello")
    public String hello() {
        return "Hello.. Current Date: " + new Date();
    }
}
