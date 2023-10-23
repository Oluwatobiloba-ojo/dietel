package Snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringFunctionTest {
    @Test
    public void testIsAnagram(){
       boolean result = StringFunction.isAnagram("ada", "daa");
        assertTrue(result);
    }   @Test
    public void testIsAnagram2(){
        boolean result = StringFunction.isAnagram("9900", "0099");
        assertTrue(result);
    }
    @Test
    public void testIsAnagram3(){
        boolean result = StringFunction.isAnagram("meat", "etam");
        assertTrue(result);
    }
    @Test
    public void testIsAnagram4(){
        boolean result = StringFunction.isAnagram("ada", "dan");
        assertFalse(result);
    }

}
