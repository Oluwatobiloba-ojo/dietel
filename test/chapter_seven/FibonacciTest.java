package chapter_seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void testForFibonacciFunction(){
        assertEquals( 21.0,Fibonacci.fibonnaci(30));
    }

    @Test
    public void testForFibonacciFunction2(){
        assertEquals(34.0, Fibonacci.fibonnaci(40));
    }
    @Test
    public void testForFibonacciFunction3(){
        assertEquals(34.0, Fibonacci.fibonnaci(50));
    }
    @Test
    public void testForFibonacciFunction4(){
        assertEquals(55.0, Fibonacci.fibonnaci(60));
    }

    @Test
    public void testForFibonacciFunction5(){
        assertEquals(0.0, Fibonacci.fibonnaci(-10));
    }
    @Test
    public void testForFibonacciFunction6(){
        assertEquals(8.0, Fibonacci.fibonnaci(10));
    }


}