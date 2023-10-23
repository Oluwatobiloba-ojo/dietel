package chapter_six;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    public void testForADigitIsPalindrome(){
        int number = 2345;
        boolean result = Functions.isPalindrome(number);
        assertFalse(result);
    }
    @Test
    public void testForADigitIsPalindrome2(){
        int number = 12321;
        boolean result = Functions.isPalindrome(number);
        assertTrue(result);
    }
    @Test
    public void testForADigitIsPalindrome3(){
        int number = 12563;
        boolean result = Functions.isPalindrome(number);
        assertFalse(result);
    }
    @Test
    public void testForADigitIsAPalindrome(){
        int number = -121;
        boolean result = Functions.isPalindrome(number);
        assertFalse(result);
    }
}
