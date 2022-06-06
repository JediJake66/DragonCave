import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {
    Functions functions;

    @BeforeEach
    void setUp() {
        functions = new Functions();
    }
    @Test
    void takeInput() {
        assertEquals(0,functions.takeInput());
    }



    @AfterEach
    void tearDown() {
    }
}