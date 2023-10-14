package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitTest {

    @Test
    public void testForTheSumOfFourDigitValue(){
        int number = 1234;
        int result = Digit.sumDigit(number);
        assertEquals(result, 10);
    }
    @Test
    public void testForSumOfNegativeDigit(){
        int number = -2345;
        int result = Digit.sumDigit(number);
        assertEquals(result, 10);
    }
    @Test
    public void testForTheSumOfDigit(){
        int number = 10123;
        int result = Digit.sumDigit(number);
        assertEquals(result, 7);
    }
    @Test
    public void testForSumOfDifferentDigits(){
        int number = 123456;
        int result = Digit.sumDigit(number);
        assertEquals(21, result);
    }
    @Test
    public void testForSumOfDigit(){
        int number = 7631;
        int result = Digit.sumDigit(number);
        assertEquals(result, 17);
    }
}
