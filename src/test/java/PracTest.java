import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracTest {
    @Test
    void sumTest() {
        Prac p = new Prac();
        int r = p.foo(10, 5);
        assertEquals(15, r);
    }
}