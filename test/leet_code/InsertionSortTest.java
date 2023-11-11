package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {

    @Test
    public void testForInsertionOfAnArrayWithLengthOf4(){
        assertArrayEquals(new int[]{3, 4, 6, 8}, InsertionSort.sort(new int[]{8, 6, 4, 3}));
    }

    @Test
    public void testForInsertionOfAnArrayWithLengthOf8(){
        assertArrayEquals(new int[]{1, 1, 3, 4, 5, 7, 8, 9}, InsertionSort.sort(new int[]{4, 7, 1, 8, 3, 5, 9, 1}));
    }

    @Test
    public void testForTheInsertionOfArrayWithLengthOf5(){
        assertArrayEquals(new int[]{0, 10, 14, 50, 100},  InsertionSort.sort(new int[]{10, 50, 100, 14, 0}));
    }
}
