package chapter_seven;

import org.junit.jupiter.api.Test;
import static chapter_seven.DuplicateElimination.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateEliminationTest {

    @Test
    public void testForTheRemovalOfDuplicateElementInAnArray(){
        int[] numbers = {1, 1, 2, 3, 2, 1, 2, 3};
        int[] removal = duplicate(numbers);
        int[] result = {1, 2, 3};
        assertArrayEquals(removal, result);
    }

    @Test
    public void testForTheRemovalOfDuplicateEliminationInAnArray(){
        int[] numbers = {1, 1, 1, 1, 1, 5, 5, 8, 9, 2, 3, 4, 5, 8, 9};
        int[] removal = {1, 5, 8, 9, 2, 3, 4};
        int[] result = duplicate(numbers);
        assertArrayEquals(removal, result);
    }

    @Test
    public void testForRemovalOfDuplicate(){
        int[] numbers = {3, 4, 3, 5, 6, 5, 4};
        int[] removal = {3, 4, 5, 6};
        int[] result = duplicate(numbers);
        assertArrayEquals(removal, result);
    }
}
