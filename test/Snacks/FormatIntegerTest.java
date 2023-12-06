package Snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatIntegerTest {

    @Test
    public void testThatFormatOfIntegerWithPrefixZero(){
        assertEquals("0034", FormatInteger.format(34, 4));
    }@Test
    public void testThatFormatOfIntegerWithPrefixOf5Zero(){
        assertEquals("00034", FormatInteger.format(34, 5));
    }@Test
    public void testThatFormatOfIntegerWithPrefixOf1Zero(){
        assertEquals("34", FormatInteger.format(34, 1));
    }
}
