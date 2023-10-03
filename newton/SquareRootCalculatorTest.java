import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class SquareRootCalculatorTest {

    @Test
    public void testCalculateSquareRootOfZero() {
        double tolerance = 1e-5;
        assertEquals(0.0, SquareRootCalculator.calculateSquareRoot(0.0, tolerance), tolerance);
    }

    @Test
    public void testCalculateSquareRootOfPositiveNumber() {
        double tolerance = 1e-5;
        assertEquals(1.0, SquareRootCalculator.calculateSquareRoot(1.0, tolerance), tolerance);
        assertEquals(Math.sqrt(2), SquareRootCalculator.calculateSquareRoot(2.0, tolerance), tolerance);
        assertEquals(Math.sqrt(10), SquareRootCalculator.calculateSquareRoot(10.0, tolerance), tolerance);
        assertEquals(Math.sqrt(100), SquareRootCalculator.calculateSquareRoot(100.0, tolerance), tolerance);
    }

    @Test
    public void testCalculateSquareRootOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> SquareRootCalculator.calculateSquareRoot(-1.0, 1e-5));
    }
}
