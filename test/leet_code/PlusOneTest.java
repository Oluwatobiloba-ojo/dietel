package leet_code;

import org.junit.jupiter.api.Test;

import static leet_code.PlusOne.plus;
import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    public void testThatWhenWeDoPlusOneOf123Get124(){
        int[] numbers = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 4}, plus(numbers));
    }
    @Test
    public void testThatWhenWeDoPlusOneOf4321Get4322(){
        int[] numbers = {4, 3, 2, 1};
        assertArrayEquals(new int[]{4, 3, 2, 2}, plus(numbers));
    }
    @Test
    public void testThatWhenWeDoPlusOne9WeGet10(){
        int[] numbers = {9};
        assertArrayEquals(new int[]{1,0}, plus(numbers));
    }
    @Test
    public void testThatWhenWeDoPlusOneFor999WeGet1000(){
        int[] numbers = {9, 9, 9};
        assertArrayEquals(new int[]{1, 0, 0, 0}, plus(numbers));
    }

    @Test
    public void testThatWhenWeDoPlusOneFor1234999WeGet1235000(){
        int[] numbers = {1, 2, 3, 4, 9, 9, 9};
        assertArrayEquals(new int[]{1, 2, 3, 5, 0, 0, 0}, plus(numbers));
    }

}