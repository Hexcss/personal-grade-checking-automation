package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testGreet() {
        assertEquals("Hello, World!", Main.greet("World"));
    }

    @Test
    public void testGreet_2() {
        assertEquals("Hey, World!", Main.greet("World"));
    }
}
