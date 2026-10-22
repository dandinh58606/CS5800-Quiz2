
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        int actual = calculator.subtract(7, 4); //test now passes
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply(){
        int expected = 6;
        int actual = calculator.multiply(2, 3); //test now passes
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide(){
        int expected = 2;
        int actual = calculator.divide(8, 4);
        assertEquals(expected, actual); //test now passes
    }
}
