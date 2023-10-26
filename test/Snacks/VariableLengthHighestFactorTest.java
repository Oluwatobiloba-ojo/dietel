package Snacks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VariableLengthHighestFactorTest {

    @Test
    public void testForHighestCommonFactorNumber() {
        int[] numbers = {-2, 12, 36};
        int[] result = VariableLengthHighestFactor.highestFactor(numbers);
        int[] answer = {0};
        assertArrayEquals(result, answer);
    }

    @Test
    public void testForHighestCommonFactor2(){
        int[] numbers = {6, 12, 18, 36};
        int[] result = VariableLengthHighestFactor.highestFactor(numbers);
        int[] answer = {2, 3};
        assertArrayEquals(result, answer);
    }

    @Test
    public void testForHighestCommonFactor3(){
        int[] numbers = {6, 12};
        int[] result = VariableLengthHighestFactor.highestFactor(numbers);
        int[] answer = {2, 3};
        assertArrayEquals(result, answer);
    }

    @Test
    public void testForHighestCommonFactor4(){
        int[] numbers = {6, 3};
        int[] result = VariableLengthHighestFactor.highestFactor(numbers);
        int[] answer = {3};
        assertArrayEquals(result, answer);
    }

    @Test
    public void testForHighestCommonFactor5(){
        int [] number = {25, 50};
        int[] result = VariableLengthHighestFactor.highestFactor(number);
        int[] answer = {5, 5};
        assertArrayEquals(answer, result);
    }

    @Test
    public void testForHighestCommonFactor6(){
        int [] number = {24, 60};
        int[] result = VariableLengthHighestFactor.highestFactor(number);
        int[] answer = {2, 2, 3};
        assertArrayEquals(answer, result);
    }

}
