package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @RequestMapping("/")
    public String test() {
        return " Running Spring Boot Application on port 8081 using Jenkins Pipeline";
    }
}
