package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementNotEqualToNeighbourTest {

    @Test
    public void testThatAnArrayElementIsNotEqualToAnAverageOfNeighbour(){
       int[] input = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{1, 2, 4, 5, 3}, ArrayElementNotEqualToNeighbour.notEquals(input));
    }

    @Test
    public void testThatAnArrayElementIsNotEqualToAnAverageOfNeighbourOfAnUnsorted(){
        int[] input = {6, 2, 0, 9, 7};
        assertEquals(new int[]{9, 7, 6, 2, 0}, ArrayElementNotEqualToNeighbour.notEquals(input));
    }

}