package com.guild.spring5webapp.didemo.controllers;

import com.guild.spring5webapp.didemo.service.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
