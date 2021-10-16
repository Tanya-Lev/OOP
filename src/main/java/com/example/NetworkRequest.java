package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NetworkRequest {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/about")
    public String about() {
        return "About us.";
    }

    @GetMapping("/options")
    public String options(@RequestParam(value = "name", defaultValue = "") String name) {
        if (name.isBlank())
            name = "Options.";
        else
            name = "Not an option";

        return name;
    }

}
