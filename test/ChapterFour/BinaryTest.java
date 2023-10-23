package ChapterFour;

import chapter_4.BinaryInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTest {
    @Test
    public void testThatBinaryDigitCanBeConvertedToDecimalInteger(){
        int result = BinaryInteger.binaryConverter(101);
        assertEquals(5, result);
    }
//    @Test
//    public void testThatBinaryDigitOnlyContainZeroAndOne(){
//
//    }
}
