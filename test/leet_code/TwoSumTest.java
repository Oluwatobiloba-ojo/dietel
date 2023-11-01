package leet_code;

import org.junit.jupiter.api.Test;

import static leet_code.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void testForTargetWithinAListDoingTwoSums(){
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] twoSumIndex = {0, 1};
        assertArrayEquals(twoSumIndex, twoSum(numbers, target));
    }

    @Test
    public void testForTargetWithAListHavingItDoASumOfTheNumbers(){
        int [] numbers = {3, 2, 4};
        int target = 6;
        int[] twoSumIndex = {1, 2};
        assertArrayEquals(twoSumIndex, twoSum(numbers, target));
    }

    @Test
    public void testForTargetWithinAListHavingTheValueThatSumItUp(){
        int[] numbers = {3, 3};
        int target = 6;
        int[] twoSumIndex = {0, 1};
        assertArrayEquals(twoSumIndex, twoSum(numbers, target));
    }
    @Test
    public void testForTargetIfTheListIsHavingADuplicateElement(){
        int[] numbers = {1, 1, 1, 1};
        int target = 2;
        int[] twoSumIndex = {0, 1};
        assertArrayEquals(twoSumIndex, twoSum(numbers, target));
    }
    @Test
    public void testForTargetIfTheListIsHavingAOneUniqueAndRestDuplicate(){
        int[] numbers = {2, 5, 5, 11};
        int target = 10;
        int[] twoSumIndex = {1, 2};
        assertArrayEquals(twoSumIndex, twoSum(numbers, target));
    }

    @Test
    public void testForTargetIfTheListIsNegativeElement(){
        int[] numbers = {-10,-1,-18,-19};
        int target = -19;
        int[] twoSumIndex = {1,2};
        assertArrayEquals(twoSumIndex, twoSum(numbers, target));
    }
}