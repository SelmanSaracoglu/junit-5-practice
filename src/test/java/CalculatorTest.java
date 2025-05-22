import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator underTest = new Calculator();
    int number = 10;


    @Test
    public void addition(){
        int result = underTest.add(2,3);
        assertEquals(5, result, "Verify basic addition, result should be five");
    }

    @Test
    public void isEvenTest() {
        boolean result = underTest.isEven(4);
        assertTrue(result, "The number should be even");
    }

    @Test
    public void isOddTest(){
        boolean result = underTest.isEven(3);
        assertFalse(result, "The number should not be even");
    }

    @Test
    public void divideByZeroShouldReturnNull(){
        Integer result = underTest.divide(10,0);
        assertNull(result, "Division by zero should result in null");
    }

    @Test
    public void divideByNonZero(){
        Integer result = underTest.divide(10,2);
        assertNotNull(result, "result should not be null");
        assertEquals(5, result);
    }



}
