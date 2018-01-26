package com.guild.spring5webapp.didemo.controllers.springframework;

import com.guild.spring5webapp.didemo.service.GreetingsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingsServiceImpl greetingsService;

    public String sayHello() {
        return greetingsService.sayGreeting();
    }
}
