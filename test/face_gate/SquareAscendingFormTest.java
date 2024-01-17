package selfassesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareAscendingFormTest {

    @Test
    public void testThatArrayPutIntoAMethodReturnsTheSquareOfTheArrayElementInAscendingForm(){
        int[] numbers = {1, 7, 9, 10, 3};
        assertArrayEquals(new int[]{1, 9, 49, 81, 100}, FaceGate.sqrAscending(numbers));
    }
    @Test
    public void testThatAnUnsortedArrayPutIntoAMethodReturnTheSquareOfArrayElementInSortedAscending(){
        int[] numbers = {50, 60, 34};
        assertArrayEquals(new int[]{34*34, 50*50, 60*60}, FaceGate.sqrAscending(numbers));
    }
    @Test
    public void testThatWhenASortedArrayPutIntoAMethodReturnsTheSquareOfTheElementInSorted(){
        int[] numbers = {20, 10, 4, 9, 0};
        assertArrayEquals(new int[]{0, 4*4, 9*9, 10*10, 20*20}, FaceGate.sqrAscending(numbers));
    }
    @Test
    public void testThatWhenAnNegativeValuePassedIntoMethodsReturnsSquareOfThemInAnArray(){
        int[] numbers = {-20, 10, 4, -9, 0};
        assertArrayEquals(new int[]{-20*-20, -9*-9, 0, -4*-4, 10*10}, FaceGate.sqrAscending(numbers));
    }

}