package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void testForTheFibonacciTotalOfALengthOfNumbers(){
        assertEquals(Fibonaci.fibonacci(2), 1);
    }

    @Test
    public void testForTheFibonacciTotalOfALengthOfFifteen(){
        assertEquals(Fibonaci.fibonacci(15), 377);
    }

    @Test
    public void testForTheFibonacciTotalOfALengthOfFive(){
        assertEquals(Fibonaci.fibonacci(5), 3);
    }
}
