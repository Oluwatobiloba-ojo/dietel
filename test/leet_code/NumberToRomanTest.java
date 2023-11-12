package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToRomanTest {

    @Test
    public void testForTheRomanNumeralOfANumber(){
        assertEquals("V", NumberToRoman.intToRoman(5));
    }

    @Test
    public void testForTheRomanNumeralOfEight(){
        assertEquals("IX", NumberToRoman.intToRoman(9));
    }

    @Test
    public void testForTheRomanNumberWhichTheNumberIsEqualToTen(){
        assertEquals("X", NumberToRoman.intToRoman(10));
    }

    @Test
    public void testForTheRomanNumeralInWhichTheNumberIsGreaterThanTen(){
        assertEquals("XII", NumberToRoman.intToRoman(12));
    }

    @Test
    public void testForRomanNumeralInWhichTheNumberIsMoreThan10(){
        assertEquals("XX", NumberToRoman.intToRoman(20));
    }

    @Test
    public void testForRomanNumeralOfWhichTheNumberIs40(){
        assertEquals("XL", NumberToRoman.intToRoman(40));
    }

    @Test
    public void testForRomanNumeralOfWhichTheNumberIs50(){
        assertEquals("L", NumberToRoman.intToRoman(50));
    }

    @Test
    public void testForRomanNumeralOfWhichTheNumberIs56(){
        assertEquals("LVI", NumberToRoman.intToRoman(56));
    }

    @Test
    public void testForRomanNumeralOfWhichTheNumberIs66(){
        assertEquals("LXVI", NumberToRoman.intToRoman(66));
    }

    @Test
    public void testForRomanNumeralOfWhichTheNumberIs58(){
        assertEquals("LVIII", NumberToRoman.intToRoman(58));
    }

    @Test
    public void testForRomanNumeralOfANumberWhichIs78(){
        assertEquals("LXXVIII", NumberToRoman.intToRoman(78));
    }

    @Test
    public void testForTheRomanNumeralConversionOfC(){
        assertEquals("CCXL", NumberToRoman.intToRoman(240));
    }

    @Test
    public void testForTheRomanNumeralConversionForD(){
        assertEquals("DCCCL", NumberToRoman.intToRoman(850));
    }

    @Test
    public void testForTheRomanNumeralConversionOfM(){
        assertEquals("MMDXCIX", NumberToRoman.intToRoman(2599));
    }

    @Test
    public void testForTheRomanNumeralFor58(){
        assertEquals("LVIII", NumberToRoman.intToRoman(80));
    }

    @Test
    public void testForTheRomanNumeralOf900(){
        assertEquals("CML", NumberToRoman.intToRoman(950));
    }

    @Test
    public void testForTheRomanNumeralFor1994(){
        assertEquals("MCMXCIV", NumberToRoman.intToRoman(1994));
    }

    @Test
    public void testForTheRomanNumeralFor980(){
        assertEquals("MXC", NumberToRoman.intToRoman(1090));
    }
}
