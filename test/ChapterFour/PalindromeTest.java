package ChapterFour;

import chapter_4.PalindromeFunction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test
    public void testThatPalindromeWillOnlyCollectFourDigitNumber(){
        boolean result = PalindromeFunction.palindrome(123);
        assertFalse(result);
    }
    @Test
    public void testThatNotAllFourDigitArePalindrome(){
        boolean result = PalindromeFunction.palindrome(1234);
        assertFalse(result);
    }
    @Test
    public void testForNumbersWhichArePalindrome(){
        boolean result = PalindromeFunction.palindrome(1221);
        assertTrue(result);
    }
}
