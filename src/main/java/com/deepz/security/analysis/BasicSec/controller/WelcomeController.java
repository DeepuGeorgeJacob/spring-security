package com.deepz.security.analysis.BasicSec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/sign")
    public String signIn() {
        return "SignedIn";
    }

    @GetMapping(value = "/data")
    public String getData() {
        return "This is data";
    }

    @GetMapping(value = "/contact")
    public String getContact() {
        return "This is my contact";
    }

    @GetMapping(value = "/logout")
    public String logout() {
        return "Logout";
    }
}
