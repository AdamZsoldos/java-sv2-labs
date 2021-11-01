package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GentlemanTest {

    @Test
    void sayHelloTest() {
        Gentleman gentleman = new Gentleman();
        assertEquals("Hello John Doe!", gentleman.sayHello("John Doe"));
    }
}
