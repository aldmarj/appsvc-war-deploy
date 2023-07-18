package com.devops.azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    String message = "howdy";

    @GetMapping("/hello")
    public String index() {
        return message;
    }
}