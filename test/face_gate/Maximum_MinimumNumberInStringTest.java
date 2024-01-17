package selfassesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_MinimumNumberInStringTest {

    @Test
    public void testThatTheMinimumAndMaximumValueOfIntegerInStringIs10And27(){
        String number = "10 12 13 14 15 27";
        assertArrayEquals(new int[]{10, 27}, FaceGate.maximum_minimum_of_digit(number));
    }
    @Test
    public void testThatTheMinimumAndMaximumValueOfAnIntegerInAString(){
        String nums = "1 20 40 50 90 100 700";
        assertArrayEquals(new int[]{1, 700}, FaceGate.maximum_minimum_of_digit(nums));
    }

}