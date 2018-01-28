package com.guild.spring5webapp.didemo.controllers.manual;

import com.guild.spring5webapp.didemo.service.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingsServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals("Have a good day 123!!!", constructorInjectedController.sayHello());
    }
}
