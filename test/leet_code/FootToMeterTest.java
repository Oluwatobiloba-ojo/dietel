package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootToMeterTest {

    @Test
    public void testForTheConversionOfFootToMeter(){
        assertEquals(0.305, FootToMeter.footToMeter(1));
    }@Test
    public void testForTheConversionOf2FeetToMeter(){
        assertEquals(2.745, FootToMeter.footToMeter(9));
    }@Test
    public void testForTheConversionOf10FeetToMeter(){
        assertEquals(3.050, FootToMeter.footToMeter(10));
    }@Test
    public void testForTheConversionOfMeterToFeet(){
        assertEquals(213.135, FootToMeter.meterToFeet(65));
    }

}