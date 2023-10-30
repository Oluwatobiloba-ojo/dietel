package chapter_seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void testForFibonacciFunctionWhenInput30Gives21(){
        assertEquals( 21.0,Fibonacci.fibonnaci(30));
    }

    @Test
    public void testForFibonacciFunctionOfForty(){
        assertEquals(34.0, Fibonacci.fibonnaci(40));
    }
    @Test
    public void testForFibonacciFunctionOfFiftyToGives34(){
        assertEquals(34.0, Fibonacci.fibonnaci(50));
    }
    @Test
    public void testForFibonacciFunctionForNumberGreaterThan50(){
        assertEquals(55.0, Fibonacci.fibonnaci(60));
    }

    @Test
    public void testForThatFibonacciFunctionDoesNotGiveValueForNegativeInput(){
        assertEquals(0.0, Fibonacci.fibonnaci(-10));
    }
    @Test
    public void testForFibonacciFunctionOfTen(){
        assertEquals(8.0, Fibonacci.fibonnaci(10));
    }


}