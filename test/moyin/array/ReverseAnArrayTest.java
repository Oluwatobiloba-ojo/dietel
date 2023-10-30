package moyin.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAnArrayTest {

    @Test
    public void testForTheReverseOfArray(){
        int[][] arrays = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int [][] reverseResult = {{7, 4, 1}, {8, 5, 2},{9, 6, 3}};
        int[][] reverseAnswer = ReverseAnArray.reverse(arrays);
        assertArrayEquals(reverseResult,reverseAnswer);
    }

    @Test
    public void testForReverseOfAnArray2(){
        int[][] arrays = {{5, 2, 7}, {9, 8, 1}, {6, 4, 3}};
        int[][] reverseResult = {{6, 9, 5}, {4, 8, 2}, {3, 1, 7}};
        int[][] reverseAnswer = ReverseAnArray.reverse(arrays);
        assertArrayEquals(reverseResult, reverseAnswer);
    }


}