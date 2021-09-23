/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.S03_Junit_in_actions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author huynq
 */
public class GreetingImplTest {

    private Greeting greetingImpl;

/*
    // need add this to POM file -> @BeforeEach work
*/
//    <build>
//        <plugins>
//            <plugin>
//                <artifactId>maven-surefire-plugin</artifactId>
//                <version>2.22.2</version>
//                <dependencies>
//                    <dependency>
//                        <groupId>org.junit.platform</groupId>
//                        <artifactId>junit-platform-surefire-provider</artifactId>
//                        <version>1.3.2</version>
//                    </dependency>
//                </dependencies>
//            </plugin>
//        </plugins>
//    </build>

    @BeforeEach
    public void setup() {

        System.out.println("before");
        greetingImpl = new GreetingImpl();
    }

    @Test
    public void testGreet() {

        String result = greetingImpl.greet("Junit");
        Assertions.assertNotNull(result);

        Assertions.assertEquals("Hello Junit", result);

    }

    @Test
    public void greetShouldThrowAnException_ForNameIsNull() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            greetingImpl.greet(null);
        });

    }

    @Test
    public void greetShouldThrowAnException_ForNameIsBlank() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            greetingImpl.greet("");
        });

    }

    @AfterEach
    public void teardown() {

        System.out.println("after");
        greetingImpl = null;
    }

}
