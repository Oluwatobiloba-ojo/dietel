package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementNotEqualToNeighbourTest {

    @Test
    public void testThatAnArrayElementIsNotEqualToAnAverageOfNeighbour(){
       int[] input = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{1, 2, 4, 5, 3}, ArrayElementNotEqualToNeighbour.notEquals(input));
    }

//    @Test
//    public void testThatAnArrayElementIsNotEqualToAnAverageOfNeighbour(){
//        int[] input = {1, 2, 3, 4, 5};
//        assertEquals(new int[]{1, 2, 4, 5, 3}, ArrayElementNotEqualToNeighbour.notEquals(input));
//    }

}