import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Test on Empty String")
    public void testAddEmptyString() {
        Calculator calculator=new Calculator();
        int expected=0;
        int actual=calculator.add("");
        assertEquals(expected,actual);
    }
}
