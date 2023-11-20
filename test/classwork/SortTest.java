package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortTest {

    @Test
    public void testThatWeCanSort(){
        int [] numbers = {42, 18, 41, 22, 15, 12};
        int [] shuffleNumbers = {18, 42, 22, 41, 12, 15};
        assertArrayEquals(shuffleNumbers, Sort.shuffle2(numbers));
    }

    @Test
    public void testThatWeCanSort2(){
        int [] numbers = {42, 18, 41, 22, 15};
        int [] shuffleNumbers = {18, 42, 22, 41,15};
        assertArrayEquals(shuffleNumbers, Sort.shuffle2(numbers));
    }

    @Test
    public void testThatWeCanSortTheMiddleOfTheArray(){
        int [] numbers = {42, 15, 18, 12, 13, 3};
        int [] shuffleNumbers = {42, 15, 12, 18,13, 3};
        assertArrayEquals(shuffleNumbers, Sort.shuffleMiddle(numbers));
    }
    @Test
    public void testThatWeCanSortTheMiddleOfAnArray(){
        int [] numbers = {42, 15, 18, 12, 13};
        int [] shuffleNumbers = {42, 15, 12, 18,13};
        assertArrayEquals(shuffleNumbers, Sort.shuffleMiddle(numbers));
    }
    @Test
    public void testThatWeCanSortTheMiddleOfArray(){
       int [] input = {43, 42, 15, 18, 13, 17, 19};
       int [] shuffleNumbers = {43, 42, 15, 13, 18, 17, 19};
       assertArrayEquals(shuffleNumbers, Sort.shuffleMiddle(input));
    }
}