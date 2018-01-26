package com.guild.spring5webapp.didemo.controllers.manual;

import com.guild.spring5webapp.didemo.controllers.manual.SetterInjectedController;
import com.guild.spring5webapp.didemo.service.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingsServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingsServiceImpl.GREETING_TEXT, setterInjectedController.sayHello());
    }
}
