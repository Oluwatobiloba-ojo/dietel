package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    public void testForTheCommonDivisorInANaturalNumber(){
        int result = Greatest.commonDivisor(252, 105);
        assertEquals(result, 21);
    }
    @Test
    public void testForTheCommonDivisorInANaturalNumber2(){
        int result = Greatest.commonDivisor(765, 714);
        assertEquals(result, 51);
    }
    @Test
    public void testForTheCommonDivisor(){
        int result = Greatest.commonDivisor(2740, 1760);
        assertEquals(result, 20);
    }
    @Test
    public void testForTheCommonDivisor2(){
        int result = Greatest.commonDivisor(693, 3213);
        assertEquals(result, 63);
    }
    @Test
    public void testForTheCommonDivisor3(){
        int result = Greatest.commonDivisor(693, 3213);
        assertEquals(result, 63);
    }
    @Test
    public void testForTheCommonDivisor4(){
        int result = Greatest.commonDivisor(12, 20);
        assertEquals(result, 4);
    }
}
