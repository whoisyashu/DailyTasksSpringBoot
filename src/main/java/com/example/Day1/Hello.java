package com.example.Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hello(){
        return "This is the first line, baaki 2 routes:\n http://localhost:8080/abc and \n http://localhost:8080/xyz";
    }
    @GetMapping("/xyz")
    public String xyz(){
        return "Humne aaj Spring Boot ka basic Seekha";
    }
    @GetMapping("/abc")
    public String abc(){
        return "3 routes bheje hai";
    }
}
