package leet_code;

import org.junit.jupiter.api.Test;

import static leet_code.MoveElementToEnd.elementToEnd;
import static org.junit.jupiter.api.Assertions.*;

class MoveElementToEndTest {

    @Test
    public void testThatElementInAnArrayPickMoveToTheEndOfTheArray(){
        int[] numbers = {2, 1, 2, 2, 2, 3, 4, 2};
        int[] result = {1, 3, 4, 2, 2, 2, 2, 2};
        assertArrayEquals(result, elementToEnd(numbers, 2));
    }
}