package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DivisibleBy5Test {

    @Test
    public void testForThat1IsNotDivisibleBy5(){
        boolean result = Maths.divisible5(1);
        assertFalse(result);
    }
    @Test
    public void testThat2IsNotDivisibleBy5(){
        boolean result = Maths.divisible5(2);
        assertFalse(result);
    }
    @Test
    public void testThat3IsNotDivisibleBy5(){
        boolean result = Maths.divisible5(3);
        assertFalse(result);
    }
    @Test
    public void testForElementDivisibleBy5(){
        boolean result = Maths.divisible5(5);
        assertTrue(result);
    }
    @Test
    public void testForElementDivisibleBy5Two(){
        boolean result = Maths.divisible5(25);
        assertTrue(result);
    }
    @Test
    public void testForElementDivisibleBy5Three(){
        boolean result = Maths.divisible5(36);
        assertFalse(result);
    }
    @Test
    public void testForElementDivisibleBy5Four(){
        boolean result = Maths.divisible5(24);
        assertFalse(result);
    }
    @Test
    public void testForElementDivisibleBy5Five(){
        boolean result = Maths.divisible5(125);
        assertTrue(result);
    }
    @Test
    public void testForElementDivisibleBy5Six(){
        boolean result = Maths.divisible5(60);
        assertTrue(result);
    }
    @Test
    public void testForElementDivisibleBy5Seven(){
        boolean result = Maths.divisible5(7);
        assertFalse(result);
    }

}
