package selfassesment;

import chapter_six.Digit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigitTest {
    @Test
    public void testThatNumbersSeperatedCanBeSumUp(){
        int result = Digit.sumDigit(-2+3+4);
        assertEquals(5, result);
    }
    @Test
    public void testThatFourDigitNumbersCanBeSumUp(){
        int result = Digit.sumDigit(-1234);
        assertEquals(result, 8);
    }
    @Test
    public void testThatZerosNumberCanBeSumUp(){
        int result = Digit.sumDigit(1010);
        assertEquals(2, result);
    }
    @Test
    public void testThatNegativeNumbersCanBeSumUp(){
        int result = Digit.sumDigit(-1234);
        assertEquals(8, result);
    }
    @Test
    public void testThatNumbersCanBeSummedUp(){
        int result = Digit.sumDigit(156);
        assertEquals(12, result);
    }
    @Test
    public void testThatZeroWillResultToZero(){
        int result = Digit.sumDigit(0);
        assertEquals(0, result);
    }
    @Test
    public void testThatLargeNumbersCanBeSummedUp(){
        int result = Digit.sumDigit(12345678);
        assertEquals(36, result);
    }
    @Test
    public void testThatNumbersWithDifferentSigns(){
        int result = Digit.sumDigit(-234);
        assertEquals(result, 5);
    }
}
