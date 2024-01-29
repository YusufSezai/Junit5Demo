import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice", 85.5);
        assertEquals("Orange Juice", c.getLiquidType());
    }

    @Test
    void getpercentageFull() {
        Cup c = new Cup("Orange Juice", 85.5);
        assertEquals(85.5, c.getPercentFull(), 0.001);
    }

    @Test
    void setLiquidType() {
        Cup c = new Cup("Orange Juice", 85.5);
        c.setLiquidType("water");
        assertEquals("water", c.getLiquidType());
    }

    @Test
    void setPercentFull() {
        Cup c = new Cup("Orange Juice", 85.5);
        c.setPercentFull(65.2);
        assertEquals(65.2, c.getPercentFull(), 0.001);
    }
}