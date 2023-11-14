package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubsequenceTest {

    @Test
    public void testThatForTheUniqueSubSequenceInAString(){
        String input = "aabca";
        assertEquals(3, PalindromicSubsequence.countPalindromicSubsequence(input));
    }

    @Test
    public void testThatForTheUniqueSubSequenceInAStringValue(){
        String input = "adc";
        assertEquals(0, PalindromicSubsequence.countPalindromicSubsequence(input));
    }

    @Test
    public void testThatForTheUniqueSubSequenceInAUniqueString(){
        String input = "bbcbaba";
        assertEquals(4, PalindromicSubsequence.countPalindromicSubsequence(input));
    }


}