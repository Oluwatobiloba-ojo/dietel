package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueBinaryStringTest {

    @Test
    public void testForTheAStringWhichIsNotFoundInTheStringArray(){
        String[] nums = {"01", "10"};
        assertEquals("00", UniqueBinaryString.findDifferentBinaryString(nums));
    }

    @Test
    public void testForThatAStringWhichIsNotFoundInTheStringArray(){
        String[] nums = {"00", "01"};
        assertEquals("11", UniqueBinaryString.findDifferentBinaryString(nums));
    }
    @Test
    public void testForThatAStringWhichIsNotFoundInTheStringOfArray(){
        String[] nums = {"111","011","001"};
        assertEquals("000", UniqueBinaryString.findDifferentBinaryString(nums));
    }

    @Test
    public void testForThatAString_0WhichIsNotFoundInTheStringOfArray(){
        String[] nums = {"1"};
        assertEquals("0", UniqueBinaryString.findDifferentBinaryString(nums));
    }


}