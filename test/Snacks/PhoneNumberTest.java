package Snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {
    @Test
    public void testThatPhoneNumberExistToGiveAAndReturnNumber2(){
       String result = PhoneNumber.numberPhone("a");
       assertEquals("2", result);
    }
    @Test
    public void testThatPhoneNumberGiveOut3WhenWePutInLowerCaseD(){
        String result = PhoneNumber.numberPhone("d");
        assertEquals("3", result);
    }
    @Test
    public void testThatPhoneNumberGiveOut4WhenWePutInLowerCaseG(){
        String result = PhoneNumber.numberPhone("g");
        assertEquals("4", result);
    }
    @Test
    public void testThatNumberGiveOut5WhenWePutInLowerCaseK(){
        String result = PhoneNumber.numberPhone("k");
        assertEquals("5", result);
    }
    @Test
    public void testThatPhoneNumberGiveOut9WhenWePutInLowerCaseY(){
        String result = PhoneNumber.numberPhone("w");
        assertEquals("9", result);
    }
    @Test
    public void testThatPhoneNumberGiveOut2WhenWeInputInUpperCaseB(){
        String result = PhoneNumber.numberPhone("B");
        assertEquals("2", result);
    }
    @Test
    public void testThatPhoneNumberGiveOut5WhenWeInputInUpperCaseK(){
        String result = PhoneNumber.numberPhone("K");
        assertEquals("5", result);
    }
    @Test
    public void testThatPhoneNumberGiveOut7WhenWeInputInUpperCaseS(){
        String  result = PhoneNumber.numberPhone("S");
        assertEquals("7", result);
    }
    @Test
    public void testThatPhoneNumberGiveOut9WhenWeInputInUpperCaseZ(){
        String result = PhoneNumber.numberPhone("Z");
        assertEquals("9", result);
    }
    @Test
    public void testThatPhoneNumberWhenWeInputSpecialSymbolGiveOut0(){
        String result = PhoneNumber.numberPhone("+");
        assertEquals("+ is i", result);
    }

}
