package com.guild.spring5webapp.didemo.controllers;

import com.guild.spring5webapp.didemo.service.GreetingsServiceImpl;

public class PropertyInjectedController {
    public GreetingsServiceImpl greetingsService;

    String sayHello() {
        return greetingsService.sayGreeting();
    }
}
