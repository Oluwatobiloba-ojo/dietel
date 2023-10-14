package chapter_six;

import chapter_six.PerfectNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerfectNumberTest {
    @Test
    public void testForPerfectNumber(){
        int number = 6;
        boolean result = PerfectNumber.isPerfect(number);
        assertTrue(result);
    }
    @Test
    public void testThatFourIsNotAPerfectNumber(){
        int number = 4;
        boolean result = PerfectNumber.isPerfect(number);
        assertFalse(result);
    }
    @Test
    public void testThatNegativeNUmberIsNotAPerfectNumber(){
        int number = -6;
        boolean result = PerfectNumber.isPerfect(number);
        assertFalse(result);
    }

}