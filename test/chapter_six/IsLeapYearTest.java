package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest {

    @Test
    public void testForAYearIsALeapYear(){
       boolean result =  Years.isLeapYear(2020);
       assertTrue(result);
    }
    @Test
    public void testForAYearIsALeapYear2(){
        boolean result =  Years.isLeapYear(2021);
        assertFalse(result);
    }
    @Test
    public void testForAYearIsALeapYear3(){
        boolean result =  Years.isLeapYear(2022);
        assertFalse(result);
    }
    @Test
    public void testForAYearIsALeapYear4(){
        boolean result =  Years.isLeapYear(2023);
        assertFalse(result);
    }
    @Test
    public void testForAYearIsALeapYear5(){
        boolean result =  Years.isLeapYear(2024);
        assertTrue(result);
    }
    @Test
    public void testForAYearIsALeapYear6(){
        boolean result =  Years.isLeapYear(1999);
        assertFalse(result);
    }
    @Test
    public void testForAYearIsALeapYear7(){
        boolean result =  Years.isLeapYear(2016);
        assertTrue(result);
    }
    @Test
    public void testForAYearIsALeapYear8(){
        boolean result = Years.isLeapYear(2024);
        assertTrue(result);
    }
    @Test
    public void testThatAYearIsOnlyFourDigit(){
        boolean result = Years.isLeapYear(20);
        assertFalse(result);
    }
    @Test
    public void testThatAYearIsNotNegative(){
        boolean result = Years.isLeapYear(-2004);
        assertFalse(result);
    }
    @Test
    public void testThatALeapYearIsNot(){
        boolean result = Years.isLeapYear(1000);
        assertFalse(result);
    }
    @Test
    public void testThatALeapYearIsNot2(){
        boolean result = Years.isLeapYear(9999);
        assertFalse(result);
    }
    @Test
    public void testThatIsItISNotALeapYear(){
        boolean result = Years.isLeapYear(9998);
        assertFalse(result);
    }


}
