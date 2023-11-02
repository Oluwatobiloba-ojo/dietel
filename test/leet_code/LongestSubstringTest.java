package leet_code;

import org.junit.jupiter.api.Test;

import static leet_code.LongestSubstring.longestSubstring;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    @Test
    public void testForTheLongestSubstringOfAString(){
        String value = "abcabcbb";
        int lengthOfLongestSubString = longestSubstring(value);
        int expected = 3;
        assertEquals(lengthOfLongestSubString, expected);
    }

    @Test
    public void testForTheLongestSubStringOfAStringThatHasSameCharacters(){
        String value = "bbbbb";
        int lengthOfLongestSubString = longestSubstring(value);
        int expected = 1;
        assertEquals(lengthOfLongestSubString, expected);
    }
    @Test
    public void testForTheLongestSubStringOfAStringHavingASubSequence(){
        String value = "pwwkew";
        int lengthOfLongestSubString = longestSubstring(value);
        int expected = 3;
        assertEquals(lengthOfLongestSubString, expected);
    }
    @Test
    public void testForTheLongestSubStringOfAStringHavingJustEmptySpace(){
        String value = " ";
        int lengthOfLongestSubString = longestSubstring(value);
        int expected = 1;
        assertEquals(lengthOfLongestSubString, expected);
    }
    @Test
    public void testForTheLongestSubStringOfAStringHavingTwoWords(){
        String value = "au";
        int lengthOfLongestSubString = longestSubstring(value);
        int expected = 2;
        assertEquals(lengthOfLongestSubString, expected);
    }
}