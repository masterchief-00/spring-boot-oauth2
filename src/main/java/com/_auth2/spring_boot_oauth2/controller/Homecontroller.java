package com._auth2.spring_boot_oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
    @GetMapping("/")
    public String home() {
        return "Hello, home";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello, Secured";
    }
}
