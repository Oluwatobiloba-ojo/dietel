package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {

    @Test
    public void testForANumberIsPrimeNumber(){
        int number = 9;
        boolean result =  Functions.isPrimeNumber(number);
        assertFalse(result);
    }
    @Test
    public void testForANumberIsPrime(){
        int number = 3;
        boolean result = Functions.isPrimeNumber(number);
        assertTrue(result);
    }
    @Test
    public void testForANumberIsPrime2(){
        int number = 0;
        boolean result = Functions.isPrimeNumber(number);
        assertFalse(result);
    }
    @Test
    public void testForANegativeNumberIsNotAPrimeNumber(){
        int number = -7;
        boolean result = Functions.isPrimeNumber(number);
        assertFalse(result);
    }
    @Test
    public void testForANegativeNumberIsNotAPrimeNumber2(){
        int number = -10;
        boolean result = Functions.isPrimeNumber(number);
        assertFalse(result);
    }

}
