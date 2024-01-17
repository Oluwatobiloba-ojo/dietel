package face_gate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void testThatTheTwoSumOfNumberBetweenThisArrayIsSevenWithRangeBetweenTwoAndFour(){
        int[] numbers = {1, 2, 3, 4};
        assertEquals(7, TwoSum.sumTwoPossibleRangeOfNumber(numbers, 2, 4));
    }
    @Test
    public void testThatTheTheTwoSumOfNumbersBetweenAnArrayIs6WhenTheRangeIsBetweenOneToThree(){
        int[] numbers = {1, 1, 2, 2, 4, 5};
        assertEquals(5, TwoSum.sumTwoPossibleRangeOfNumber(numbers, 1, 3));
    }
    @Test


}