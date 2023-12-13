package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneTest {

    @Test
    public void testThatATelephoneLetterMappingBeConvertToNumberKeypad(){
        String phoneKeypad = "1-800-Flowers";
        assertEquals("1-800-3569377", Telephone.getNumber(phoneKeypad));
    }
    @Test
    public void testThatATelephoneLengthMappingConvertToNumberKeyPad(){
        String phoneKeypad = "1800flowers";
        assertEquals("18003569377", Telephone.getNumber(phoneKeypad));
    }


}