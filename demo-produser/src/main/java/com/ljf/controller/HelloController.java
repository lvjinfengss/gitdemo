package com.ljf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pr")
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String HelloWorld(){
        return "helloworld";
    }
}
