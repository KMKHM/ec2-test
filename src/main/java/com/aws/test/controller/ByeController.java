package com.aws.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ByeController {
    @GetMapping("/bye")
    public String bye() {
        return "bye!!";
    }

    @GetMapping("/world")
    public String world() {
        return "world!!!!";
    }
}
