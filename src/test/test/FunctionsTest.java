import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {

       Functions underTest = new Functions("1");

    @Test
    void shouldReturnInput() {
        String x = underTest.getInput();
        assertEquals("1",x);
    }

}