
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum(){

        int expected = 3;
        int actual = calculator.sum(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract(){
        int expected = 3;
        int actual = calculator.subtract(7, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply(){
        int expected = 6;
        int actual = calculator.multiply(2, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide(){
        int expected = 2;
        int actual = calculator.divide(8, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven(){
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
    }
}
