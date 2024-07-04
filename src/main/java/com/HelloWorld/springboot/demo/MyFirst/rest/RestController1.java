package com.HelloWorld.springboot.demo.MyFirst.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1
{
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!!!!";
    }
}
