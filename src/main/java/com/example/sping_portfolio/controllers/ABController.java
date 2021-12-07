package com.example.sping_portfolio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ABController {
    @GetMapping("/abhijay")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String abhijay() {
        return "abhijay";
    }

    @GetMapping("/kian")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String kian() {
        return "kian";
    }

    @GetMapping("/justin")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String justin() {
        return "justin";
    }
    @GetMapping("/rohan")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String rohan() {
        return "rohan";
    }
    @GetMapping("/shekar")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String shekar() {
        return "shekar";
    }
}
