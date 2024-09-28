package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        // Since HelloWorld class doesn't have any methods, we can't test anything
        // But we can test if the class is instantiated correctly
        assertNotNull(helloWorld);
    }
}
