package selfassesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    public void testThatNumbersCanBeMultiply(){
       int multiply =  Square.multiply(5, 5);
       assertEquals(25, multiply);
    }
    @Test
    public void testThatNumberCanBeMultiplied(){
        int result = Square.multiply(5, -4);
        assertEquals(-20, result);
    }
    @Test
    public void testThatNumbersCanBeMultiplied(){
        int result = Square.multiply(-10, -10);
        assertEquals(100,  result);
    }
    @Test
    public void testThatZeroMultipliedGiveZero(){
        int result = Square.multiply(5, 0);
        assertEquals(0, result);
    }
    @Test
    public void testSomething(){
        int result = Square.multiply(0, 5);
        assertEquals(0, result);
    }
    @Test
    public void testThatSomething(){
        int result = Square.multiply(0, -10);
        assertEquals(0, result);
    }
    @Test
    public void testASomething(){
        int result = Square.multiply(-5, -0);
        assertEquals(0, result);
    }

    @Test
    public void testSomething1(){
        int result = Square.multiply(-5, -0);
        assertEquals(0, result);
    }
}
