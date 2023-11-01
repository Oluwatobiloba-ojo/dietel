package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOddNumberInIntervalTest {

    @Test
    public void testForTheReturnOfOddNumbersBetweenATwoRangeNumber(){
        int low = 3;
        int high = 7;
        int[] rangeOfOdd =  CountOddNumberInInterval.countOdd(low, high);
        int[] expected = {3, 5, 7};
        assertArrayEquals(expected, rangeOfOdd);
    }
    @Test
    public void testForTheReturnOfOddNumbersBetweenARangeOfEightToNine(){
        int[] rangeOfOdd = CountOddNumberInInterval.countOdd(8, 9);
        int[] expected = {9};
        assertArrayEquals(expected, rangeOfOdd);
    }
}
