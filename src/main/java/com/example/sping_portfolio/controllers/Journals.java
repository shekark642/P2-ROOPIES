package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Journals {
    @GetMapping("/ak")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String cs() {
            return "journals/ak"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/jrs")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String ds() {
            return "journals/jrs"; // returns HTML VIEW (greeting)
    }
}
