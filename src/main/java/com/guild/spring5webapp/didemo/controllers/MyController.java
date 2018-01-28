package com.guild.spring5webapp.didemo.controllers;

import com.guild.spring5webapp.didemo.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
//        return greetingService.sayGreeting();
    }
}
