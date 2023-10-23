package chapter_seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableLengthArgumentTest {

    @Test
    public void testSomethingOnAverage(){
        double result = VariableLengthArgument.average(1, 4, 6, 6, 7, 7, 7, 10);
        assertEquals(result,6.00);
    }
    @Test
    public void testSomethingOnAverage2(){
        double result = VariableLengthArgument.average(1, 4, 6, 6, 7, 7, 7, 10, 20);
        assertEquals(result,7.56);
    }
    @Test
    public void testSomethingOnAverage3(){
        double result = VariableLengthArgument.average(1, 4, 6, 6, 7, 7, 7, 10, 40, 50);
        assertEquals(result,13.80);
    }
    @Test
    public void testSomethingOnAverage4(){
        double result = VariableLengthArgument.average(1, 4, 6, 6, 7, 7);
        assertEquals(result,5.17);
    }
    @Test
    public void testSomethingOnAverage5(){
        double result = VariableLengthArgument.average(1);
        assertEquals(result,1.0);
    }
    @Test
    public void testSomethingOnAverage6(){
        double result = VariableLengthArgument.average(1, 4, 6);
        assertEquals(result,3.67);
    }

}