import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    @DisplayName("Test on Empty String")
    public void testAddEmptyString() {
        Calculator calculator=new Calculator();
        int expected=0;
        int actual=calculator.add("");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test with Invalid Input: Spacial Characters")
    public void testAddWithInvalidInput() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.add("-"));
    }

    @Test
    @DisplayName("Test on Adding Single Number")
    public void testAddSingleNumber(){
        Calculator calculator=new Calculator();
        int expected=1;
        int actual=calculator.add("1");
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test on Adding Two Numbers")
    public void testAddTwoNumbers() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.add("1,2");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test on Adding Unknown Amount of Numbers")
    public void testAddUnknownAmountOfNumbers() {
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.add("1,2,3,4,5");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test on Adding Numbers with New Lines")
    public void testAddWithNewLines() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.add("1\n2,3");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test on Adding Numbers with Custom Delimiter")
    public void testAddWithCustomDelimiter() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.add("//;\n1;2");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test on Adding Numbers with Negative Number ")
    public void testAddWithNegativeNumber() {
        Calculator calculator = new Calculator();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-2,3"));
        assertEquals("Negatives not allowed: -2", exception.getMessage());
    }

    @Test
    @DisplayName("Test on Adding Numbers with Multiple Negative Numbers")
    public void testAddWithMultipleNegativeNumbers() {
        Calculator calculator = new Calculator();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-2,3,-4"));
        assertEquals("Negatives not allowed: -2, -4", exception.getMessage());
    }
}
