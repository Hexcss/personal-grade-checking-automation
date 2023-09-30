package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    public void testGreet() {
        assertEquals("Hello, World!", Main.greet("World"));
    }

    @org.junit.jupiter.api.Test
    public void testGreet() {
        assertEquals("Hey, World!", Main.greet("World"));
    }
}
