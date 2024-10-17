import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    @Test
    public void testSubtract() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(1, calculator.subtract(3, 2));
    }
}

class SimpleCalculator {
    public int subtract(int a, int b) {
        return a - b;
    }
}
