package com.guild.spring5webapp.didemo.controllers;

import com.guild.spring5webapp.didemo.service.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;
    @Before
    public void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingsService = new GreetingsServiceImpl();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingsServiceImpl.GREETING_TEXT, propertyInjectedController.sayHello());
    }

}
