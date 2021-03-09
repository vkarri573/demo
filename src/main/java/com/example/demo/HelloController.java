package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "hellooo worlddd.....";
    }
}
