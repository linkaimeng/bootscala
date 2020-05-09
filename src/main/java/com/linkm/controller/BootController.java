package com.linkm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello java";
    }
}
