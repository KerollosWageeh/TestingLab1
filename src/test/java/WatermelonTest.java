import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonTest {

    @Test
    public void solveWatermelon() {
        assertTrue(Watermelon.solveWatermelon(-1) == null);
        assertTrue(Watermelon.solveWatermelon(0) == null);
        assertTrue(Watermelon.solveWatermelon(110) == null);
        assertTrue(Watermelon.solveWatermelon(1) == 0);
        assertTrue(Watermelon.solveWatermelon(100) == 1);
        assertTrue(Watermelon.solveWatermelon(2) == 0);
        assertTrue(Watermelon.solveWatermelon(3) == 0);
        assertTrue(Watermelon.solveWatermelon(4) == 1);
        assertTrue(Watermelon.solveWatermelon(5) == 0);
        assertTrue(Watermelon.solveWatermelon(6) == 1);
        assertTrue(Watermelon.solveWatermelon(7) == 0);
        assertTrue(Watermelon.solveWatermelon(50) == 1);
    }
}