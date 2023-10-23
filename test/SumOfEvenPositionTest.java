import classwork.SumOfOddPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfEvenPositionTest {

    @Test
    public void testForTheSumOfEvenPositionOfAnArray(){
        int [] numbers = {1, 3, 4, 6, 7, 8, 9};
        int answer = 1 + 4 + 7 + 9;
        int result =  SumOfOddPosition.sumEvenPosition(numbers);
        assertEquals(result, answer);
    }

    @Test
    void testForTheSumOfOddValuesInAnArray(){
        int [] numbers = {1, 3, 4, 6, 7, 8, 9};
        int answer = 3 + 6 + 8;
        int result =  SumOfOddPosition.sumOddPosition(numbers);
        assertEquals(result, answer);
    }
}
