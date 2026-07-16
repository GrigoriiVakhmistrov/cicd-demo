import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int a = 5, b = 10, expected = 15;


        var result = calculator.add(a, b);

        assertEquals(expected, result);
    }
}
