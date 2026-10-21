
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
        int actual = calculator.subtract(7, 4); // should be 3 but as it stands it returns 0
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply(){
        int expected = 6;
        int actual = calculator.multiply(2, 3); //should be 6 but default returns 0
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide(){
        int expected = 2;
        int actual = calculator.divide(8, 4);
        assertEquals(expected, actual); //should return 2 but default is 0 so fails
    }
}
