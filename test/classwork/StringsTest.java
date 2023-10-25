package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static classwork.Strings.*;

public class StringsTest {


    @Test
    public void testForTheDuplicateElementInAList(){
        int[] numbers = {1, 2, 3, 3, 2, 4, 5, 6, 2, 3, 6, 6, 6, 6};
        int [] duplicateResult = removeDuplicate(numbers);
        int[] duplicateAnswer = {2, 3, 6};
        assertArrayEquals(duplicateAnswer, duplicateResult);
    }

    @Test
    public void testForDuplicateElementInAList(){
        int[] numbers = {1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 8, 9};
        int[] duplicateResult  = removeDuplicate(numbers);
        int[] duplicateAnswer = {1, 2, 3, 4};
        assertArrayEquals(duplicateAnswer, duplicateResult);
    }

    @Test
    public void testForReverseOfAStringElement(){
        String input = "i am outside";
        String reverse = reverseAString(input);
        String answer = "i ma edistuo";
        assertEquals(answer, reverse);
    }
    @Test
    public void testForReverseOfAStringElement3(){
        String input = "we outside";
        String reverse = reverseAString(input);
        String answer = "ew edistuo";
        assertEquals(answer, reverse);
    }

    @Test
    public void testForReverseOfAStringElement2(){
        String input = "adam yiola";
        String reverse = reverseAString(input);
        String answer = "mada aloiy";
        assertEquals(answer, reverse);
    }

    @Test
    public void testForWhenAStringReverseItsSame(){
        String input = "grace";
        assertFalse(checkReverse(input));
    }

    @Test
    public void testForWhenAStringReverseItsSame2(){
        String input = "Dad";
        assertTrue(checkReverse(input));
    }

    @Test
    public void testForWhenAStringReverseItsSame3(){
        String input = "Anna";
        assertTrue(checkReverse(input));
    }

    @Test
    public void testForDominantElementInAnArray(){
        int[] numbers = {9, 3, 10, 7, 4};
        int[] dominantAnswer = {10, 7, 4};
        int[] dominantResult = checkForDominantArray(numbers);
        assertArrayEquals(dominantResult, dominantAnswer);
    }

    @Test
    public void testForDominantElementInAnArray2(){
        int[] numbers = {10, 9, 8, 3, 4};
        int[] dominantAnswer = {10, 9, 8, 4};
        int[] dominantResult = checkForDominantArray(numbers);
        assertArrayEquals(dominantResult, dominantAnswer);
    }

    @Test
    public void testForNumberIsAPalindrome(){
        String number = "1111";
        assertEquals(checkForAStringIsHavingNumber(number), "Valid");
    }

    @Test
    public void testForNumberIsAPalindrome2(){
        String number = "Anna";
        assertEquals(checkForAStringIsHavingNumber(number), "invalid input");
    }
    @Test
    public void testThatATargetIsBetweenAnIndicesOfANumber(){
        String number = "13579";
        int target = 4;
        int[] indices = {1, 2};
        assertTrue(isTargetInNumber(number, target, indices));
    }

    @Test
    public void testThatATargetIsBetweenAnIndicesOfANumber2(){
        String number = "13579";
        int target = 10;
        int[] indices = {1, 2};
        assertFalse(isTargetInNumber(number, target, indices));
    }

    @Test
    public void testThatATargetIsBetweenAnIndicesOfANumber3(){
        String number = "1-37";
        int target = 4;
        int[] indices = {1, 3};
        assertTrue(isTargetInNumber(number, target, indices));
    }
}
