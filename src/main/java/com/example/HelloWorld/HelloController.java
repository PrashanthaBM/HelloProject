package com.example.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String name()
    {
        return "Hello world";
    }

    @GetMapping("/hello")
    public String dev2()
    {
        return "Hello world - dev 2 added";

    }
}
