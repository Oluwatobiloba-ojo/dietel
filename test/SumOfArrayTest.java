import classwork.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfArrayTest {

    @Test
    public void testForTheSumOfAnArray(){
        int [] numbers = {5, 3, 4, 1, 2};
        int [] result  = Array.sumOfArray(numbers);
        int [] answer = {10, 12, 11, 14, 13};
           assertEquals(result[0], answer[0]);
          assertEquals(result[1], answer[1]);
          assertEquals(result[2], answer[2]);
          assertEquals(result[3], answer[3]);
          assertEquals(result[4], answer[4]);
          int [] maximumMinimum =  Array.maximumMinimum(result);
          int [] answer2 = {14, 10};
          assertEquals(maximumMinimum[0], answer2[0]);
          assertEquals(maximumMinimum[1], answer2[1]);
    }
    @Test
    public void testForTheSumOfAnArrayAndMaximumAndHighest(){
        int [] numbers = {5, 3, 4, 7, 2};
        int [] result  = Array.sumOfArray(numbers);
        int [] answer = {16, 18, 17, 14, 19};
        assertEquals(result[0], answer[0]);
        assertEquals(result[1], answer[1]);
        assertEquals(result[2], answer[2]);
        assertEquals(result[3], answer[3]);
        assertEquals(result[4], answer[4]);
        int [] result2 = Array.maximumMinimum(result);
        int [] answer2 = {19, 14};
        assertEquals(result2[0], answer2[0]);
        assertEquals(result2[1], answer2[1]);
    }
}
