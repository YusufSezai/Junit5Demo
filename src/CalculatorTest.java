import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    public Calculator c = new Calculator();
    @Test
    void add() {
      assertEquals(9, c.Add(5,4));
    }

    @Test
    void sub() {
     assertEquals(3, c.Sub(8,5));
    }
}