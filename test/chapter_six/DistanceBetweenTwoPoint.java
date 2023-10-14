package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceBetweenTwoPoint {
    @Test
    public void testTheCalculationOfDistanceBetweenTwoPoint(){
       double result = Maths.calculateDistance(4.0, 3.0, 0.0, 0.0);
       double answer = 5.0;
       assertEquals(answer, result);
    }
    @Test
    public void testForTheCalculationOfDistanceBetweenTwoPoint(){
        double result = Maths.calculateDistance(3.0, 3.0, 9.0, 11.0);
        double answer = 10.0;
        assertEquals(answer, result);
    }
    @Test
    public void testSomething(){
        double result = Maths.calculateDistance(3.0, 3.0, 9.0, 11.0);
        double answer = 10.0;
        assertEquals(answer, result);
    }
}
