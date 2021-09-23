/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.S03_Junit_in_actions;

/**
 *
 * @author huynq
 */
public class GreetingImpl implements Greeting {

    @Override
    public String greet(String name) {

        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException();
        }

        return "Hello " + name;
    }

}
