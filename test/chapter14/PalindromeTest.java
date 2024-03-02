package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    public void testThatAStringRadarIsAPalindrome(){
        String word = "radar";
        assertTrue(Palindrome.isPalindrome(word));
    }

    @Test
    public void testThatAStringMadamIsAPalindromeWhenTheWordIsReverse(){
        String madam = "madam";
        assertTrue(Palindrome.isPalindrome(madam));
    }

    @Test
    public void testThatAStringDogIsNotEqualWhenReversed(){
        String word = "dog";
        assertFalse(Palindrome.isPalindrome(word));
    }

}