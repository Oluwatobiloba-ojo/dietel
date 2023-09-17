package selfassesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeSampleTest {
    @Test
    public void testThatItIsAFourDigitNumber(){
       boolean result = PalindromeSample.fourDigitNumber(123);
       assertFalse(result);
    }
    @Test
    public void testThatNumberIsAPalindrome(){
        boolean result = PalindromeSample.fourDigitNumber(1221);
        assertTrue(result);
    }

    @Test
    public void testThatFiveDigitNumberReturnFalseInPalindrome(){
        boolean result = PalindromeSample.fourDigitNumber(12221);
        assertFalse(result);
    }

    @Test
    public void testThatFourDigitNumberCanAlsoNotBeAPalindromeIfReverseIsNotSameAsNumber(){
        boolean result = PalindromeSample.fourDigitNumber(1223);
        assertFalse(result);
    }

}