import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testGreet() {
        Assertions.assertEquals("Hello, World!", Main.greet("World"));
    }

    @Test
    public void testGreet_2() {
        assertEquals("Hey There, World!", Main.greet("World"));
    }
}
