package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    @Test
    public void testForTheRoundFloorOfADoubleValue(){
        double number = 3.45560;
        double result =  Maths.floor(number);
        double answer = 3.0;
        assertEquals(result, answer);
    }
    @Test
    public void testThatADoubleValueOfNegativeCanBeRoundDown(){
        double number = -34.59;
        double result = Maths.floor(number);
        double answer = -34.0;
        assertEquals(result, answer);
    }
    @Test
    public void testThatANumberCanBeRoundedDown(){
        double number = 6575.455;
        double result = Maths.floor(number);
        double answer = 6575.0;
        assertEquals(result, answer);
    }

    @Test
    public void testForTheNumberThatCanBeRoundedDown(){
        double x = 5456.78797;
        double result = Maths.floor(x + 1000);
        double answer = 6457.0;
        assertEquals(result, answer);
    }
    @Test
    public void testForTheRoundingToTenth(){
        double x = 3.4567;
        double result = Maths.roundToTenth(x);
        double answer = 3.5;
        assertEquals(result, answer);
    }
    @Test
    public void testForRoundingUpToIntegers(){
        double nums = 34.567;
        int result = Maths.roundToIntegers(nums);
        int answer = 35;
        assertEquals(result, answer);
    }

    @Test
    public void testForRoundingUpToHundred(){
        double nums = 34.567;
        double result = Maths.roundToHundred(nums);
        double answer = 34.57;
        assertEquals(result, answer);
    }
    @Test
    public void testForRoundingUpToThousands(){
        double nums = 34.5679;
        double result = Maths.roundToThousands(nums);
        double answer = 34.568;
        assertEquals(answer, result);
    }
}
