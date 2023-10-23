package Snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountStringTest {

    @Test
    public void testForCountingOfDigitInAStringArray(){
        String [] characters = {"ABC21F", "1-3CPZ","A01L"};
        int result = Chars.countDigitInAString(characters);
        int answer = 6;
        assertEquals(answer, result);
    }
    @Test
    public void testForCountingOfDigitInAStringArray2(){
        String [] characters = {"111ABC21F", "13CPZ","A1L3"};
        int result = Chars.countDigitInAString(characters);
        int answer = 9;
        assertEquals(answer, result);
    }
    @Test
    public void testForASumOfAnIndexInArrayToGiveUsSameAsTheTarget(){
        int [] numbers = {2, 1, 4, 5, 8, 0, 9};
        int [] result = Chars.sumOfAnIndexArray(numbers, 3);
        int [] answer = {0, 1};
        assertArrayEquals(answer, result);
    }
    @Test
    public void testForASumOfAnIndexInArrayToGiveUsSameAsTheTarget2(){
        int [] numbers = {2, 1, 4, 5, 8, 0, 9};
        int [] result = Chars.sumOfAnIndexArray(numbers, 5);
        int [] answer = {1, 2};
        assertArrayEquals(answer, result);
    }
    @Test
    public void testForASumOfAnIndexInArrayToGiveUsSameAsTheTarget3(){
        int [] numbers = {2, 1, 4, 5, 8, 0, 9};
        int [] result = Chars.sumOfAnIndexArray(numbers, 6);
        int [] answer = {0, 2};
        assertArrayEquals(answer, result);
    }
}
