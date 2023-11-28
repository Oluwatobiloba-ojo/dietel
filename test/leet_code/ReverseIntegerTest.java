package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testForTheReverseOfAnInteger(){
        int number = 123;
        assertEquals(321, ReverseInteger.reverse(number));
    }

    @Test
    public void testForTheReverseOfAnIntegerWhichIsHavingZeroValueWith(){
        int number = 120;
        assertEquals(21, ReverseInteger.reverse(number));
    }

    @Test
    public void testForTheReverseOfAnIntegerWithANegativeValue(){
        int number = -123;
        assertEquals(-321, ReverseInteger.reverse(number));
    }
}
