import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareRootCalculatorTest {
    
    @Test
    public void testCalculateSquareRoot_PositiveNumber() {
        double number = 9.0;
        double expected = 3.0;
        double result = SquareRootCalculator.calculateSquareRoot(number);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateSquareRoot_Zero() {
        double number = 0.0;
        double expected = 0.0;
        double result = SquareRootCalculator.calculateSquareRoot(number);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateSquareRoot_NegativeNumber() {
        double number = -1.0;

        assertThrows(IllegalArgumentException.class, () -> {
            SquareRootCalculator.calculateSquareRoot(number);
        });
    }
}