package com.example.laba1_zaybert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Laba1ZaybertApplication {

    public static void main(String[] args) {
        SpringApplication.run(Laba1ZaybertApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    @GetMapping("/about")
    public String sayAbout(@RequestParam(defaultValue = "about as") String val){
        return  String.format(val);
    }

    @GetMapping("/options")
    public  String sayOptions(@RequestParam (value="not_an_option", defaultValue = "options") String val){
        return String.format(val);
    }
}
