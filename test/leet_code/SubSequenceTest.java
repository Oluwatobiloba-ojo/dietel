package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubSequenceTest {

    @Test
    public void testThatASubSequenceOfAnArrayInTheSameRange(){
        int [] subArray = {9, 1, 7};
        int[] arrayNumbers = {4, 9, -8, 6, 1, 7, 6};
        assertTrue(SubSequence.isValidSubsequence(subArray, arrayNumbers));
    }

    @Test
    public void testForASubSequenceOfAnArrayHavingTheSameOrderOfTheArray(){
        int [] subArray = {3, -8, 1};
        int[] arrayNumbers = {5, 2, 1, 3, -2, -8, 1};
        assertTrue(SubSequence.isValidSubsequence(subArray, arrayNumbers));
    }

    @Test
    public void testForASubSequenceOfAnArrayHavingTheSameOrderInTheSuperArray(){
        int [] subArray = {3, -8, 5};
        int[] arrayNumbers = {5, 2, 1, 3, -2, -8, 1};
        assertFalse(SubSequence.isValidSubsequence(subArray, arrayNumbers));
    }

}