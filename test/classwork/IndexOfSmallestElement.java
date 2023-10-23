package classwork;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexOfSmallestElement {
    @Test
    public void testForTheIndexOfSmallestElement(){
        int[] numbers = {4, 56, 78, 9, 90, 1};
        int indexOfSmallest = 5;
        assertEquals(Array.indexOfSmallestElement(numbers), indexOfSmallest);
    }
    @Test
    public void testForTheSortOfAnArray(){
        int[] numbers = {4, 56, 78, 9, 90, 1};
        int [] sort = Arrays.stream(numbers).sorted().toArray();
        assertArrayEquals(sort, Array.sorts(numbers));
    }
    @Test
    public void testForTheSortOfAnArray2(){
        int[] numbers = {4, 5, 78, 2, -1, 0};
        int [] sort = Arrays.stream(numbers).sorted().toArray();
        assertArrayEquals(sort, Array.sorts(numbers));
    }

}
