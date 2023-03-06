package com.cts.awssecrets.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @Value("${com.cts.test}")
    private String secretSauce;

    @GetMapping("/value")
    public String getValue(){
        return secretSauce;

    }
}
