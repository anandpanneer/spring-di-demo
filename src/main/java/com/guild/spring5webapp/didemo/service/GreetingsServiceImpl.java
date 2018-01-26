package com.guild.spring5webapp.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingService {

    public static final String GREETING_TEXT = "Have a good day!!!";
    @Override
    public String sayGreeting() {
        return GREETING_TEXT;
    }
}
