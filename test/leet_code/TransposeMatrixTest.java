package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    @Test
    public void testThatTransposeOfA3By3ArrayIsFlippedDiagonallyTo3By3(){
        int[][] numbers = {{ 1,2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assertArrayEquals(expected, TransposeMatrix.transpose(numbers));
    }
    @Test
    public void testThatTransposeOfA2By3ArrayIsFlippedDiagonallyTo3By2(){
        int[][] numbers = {{ 1,2, 3}, {4, 5, 6}};
        int[][] expected = {{1, 4}, {2, 5}, {3, 6}};
        assertArrayEquals(expected, TransposeMatrix.transpose(numbers));
    }

}