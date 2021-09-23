/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.S03_Junit_in_actions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author huynq
 */
public class GreetingImplTest {

    /**
     * Test of greet method, of class GreetingImpl.
     */
    @Test
    public void testGreet() {

        GreetingImpl greetingImpl = new GreetingImpl();
        String result = greetingImpl.greet("Junit");

        assertNotNull(result);

        assertEquals("Hello Junit", result);

    }

    @Test
    public void greetShouldThrowAnException_ForNameIsNull() {

        GreetingImpl greetingImpl = new GreetingImpl();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            greetingImpl.greet(null);
        });

    }

    @Test
    public void greetShouldThrowAnException_ForNameIsBlank() {

        GreetingImpl greetingImpl = new GreetingImpl();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            greetingImpl.greet("");
        });

    }

}
