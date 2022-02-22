package com.pks.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    String getMessage(){
        return "Hello from jenkins-cicd test2";
    }
}
