package com.guild.spring5webapp.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Have a good day!!!";
    }
}
