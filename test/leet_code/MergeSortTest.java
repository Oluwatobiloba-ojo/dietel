package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    @Test
    public void testThatICanMergeAnArray(){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int nums1Element = 3;
        int[] nums2 = {2, 5, 6};
        int nums2Element = 3;
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, MergeSort.merge(nums1, nums1Element, nums2, nums2Element));
    }@Test
    public void testThatWhenWeCanMergeAnArrayWithOneOfTheArrayElementZero(){
        int[] nums = {0};
        int nums1Element = 0;
        int[] nums2 = {1};
        int num2Element = 1;
        assertArrayEquals(new int[]{1},MergeSort.merge(nums, nums1Element, nums2, num2Element));
    }  @Test
    public void testThatWhenWeCanMergeAnArrayWithOneOfTheArrayElementZeros(){
        int[] nums = {1};
        int nums1Element = 1;
        int[] nums2 = {0};
        int num2Element = 0;
        assertArrayEquals(new int[]{1},MergeSort.merge(nums, nums1Element, nums2, num2Element));
    }

}