
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testisOdd(){
        boolean actual = calculator.isEven(5);
        assertFalse(actual);
    }

    @Test
    public void testIncrementArrays(){
        int[] expected = new int[]{2,3,4};
        int[] actual = calculator.incrementArrays(new int[]{1,2,3});
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDivideByZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0));
        String expectedMessage = "Ints cannot be divided by 0";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage,actualMessage);
    }
}
