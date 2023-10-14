package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseTest {

    @Test
    public void testForTheCalculationOfHypotenuseUsingTwoSide(){
        double side1 = 3.0;
        double side2 = 4.0;
        double result = Maths.calculateHypotenuse(side1, side2);
        double answer = 5.0;
        assertEquals(answer, result);
    }
    @Test
    public void testForTheCalculationOfHypotenuseUsingTwoSide2(){
        double side1 = 5.0;
        double side2 = 12.0;
        double result = Maths.calculateHypotenuse(side1, side2);
        double answer = 13.0;
        assertEquals(answer, result);
    }
    @Test
    public void testForTheCalculationOfHypotenuseUsingTwoSide3(){
        double side1 = 8.0;
        double side2 = 15.0;
        double result = Maths.calculateHypotenuse(side1, side2);
        double answer = 17.0;
        assertEquals(answer, result);
    }
}
