package com.example.demo.ws.rest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/test")
    public String demo(@RequestParam(defaultValue = "World") String name) {
        return name;
    }
}
