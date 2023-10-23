package chapter_seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFunctionTest {
    @Test
    public void testThatLargestElementInAnArrayCanBePointOut(){
        int [] integers = {1, 3, 5, 6, 7, 8, 9, 10};
        int largest =  ArrayFunction.largestElement(integers);
        assertEquals(10, largest);
    }
    @Test
    public void testThatLargestElementInAnArrayCanBePointOuts(){
        int [] integers = {1,4,6,8,9,9,910, 1000};
        int largest = ArrayFunction.largestElement(integers);
        assertEquals(1000, largest);
    }
    @Test
    public void testLargest2(){
        int [] integers = {1000, 5, 8, 9, 20, 50, 56, 67, 78, 200};
        int largest = ArrayFunction.largestElement(integers);
        assertEquals(1000, largest);
    }
    @Test
    public void testReverse1(){
        int [] integers = {1, 3, 5, 6, 7, 8, 9, 10};
        int[] reverse =  ArrayFunction.reverseList(integers);
        int[] result = {10, 9, 8, 7, 6, 5, 3, 1};
       assertArrayEquals(result, reverse);
    }
    @Test
    public void testReverse2(){
        int [] integers = {1000, 2000, 4000, -200, -500};
        int [] reverse = {-500, -200, 4000, 2000, 1000};
        int [] result = ArrayFunction.reverseList(integers);
        assertArrayEquals(result, reverse);
    }
    @Test
    public void testWhetherAnyElementOccurInAList(){
        int [] integers = {10, 20, 40, 60, 70, 50};
        boolean result =  ArrayFunction.checkListElement(integers, 50);
        assertTrue(result);
    }
    @Test
    public void testThatAnElementDoesNotOccurInAList(){
        int [] integers = {10, 20, 40, 50, 60, 80};
        boolean result = ArrayFunction.checkListElement(integers, -20);
        assertFalse(result);
    }
    @Test
    public void testForOddPositionInAList(){
        int [] integers = {1, 3, 5, 7, 8, 9, 10, 12, 15, 16};
        int[] result = ArrayFunction.oddPosition(integers);
        int [] answer = {3, 7, 9, 12, 16};
        assertArrayEquals(result, answer);
    }
    @Test
    public void testOddPosition2(){
        int [] integers = {19, 2, 5, 4, 7, 8, 9, 10};
        int [] result = ArrayFunction.oddPosition(integers);
        int [] answer = {2, 4, 8, 10};
        assertArrayEquals(result, answer);
    }
    @Test
    public void testForEvenPosition(){
        int [] integers = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int [] evenResult = ArrayFunction.evenPosition(integers);
        int [] answer = {0, 2, 4, 6, 8};
        assertArrayEquals(evenResult, answer);
    }
    @Test
    public void testForEvenPositionInAnArray(){
        int [] integers = {0, 11, 21, 33, 44, 55, 67, 78, 80};
        int [] evenResult = ArrayFunction.evenPosition(integers);
        int [] answer = {0, 21, 44, 67, 80};
        assertArrayEquals(evenResult, answer);
    }
    @Test
    public void testForFunctionThatComputeTotalOfAList(){
        int[] array = {1, 3, 5, 8, 9, 10};
        int result = ArrayFunction.totalArray(array);
        int answer = 1 + 3 + 5 + 8 + 9 + 10;
        assertEquals(result, answer);
    }
    @Test
    public void testForTotal(){
        int[] array = {1,3,150,350};
        int result = ArrayFunction.totalArray(array);
        int answer = 1 + 3 + 150 + 350;
        assertEquals(result,answer);
    }
    @Test
    public void testThatAStringIsAPalindrome(){
        String name = "dad";
        boolean result = ArrayFunction.isPalindrome(name);
        assertTrue(result);
    }
    @Test
    public void testThatItIsAPalindrome(){
        String name = "Moses";
        boolean result = ArrayFunction.isPalindrome(name);
        assertFalse(result);
    }
    @Test
    public void testForSumOfAListUsingForLoop(){
        int [] integers = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int result = ArrayFunction.forLoopSum(integers);
        int answer = 1 + 2 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        assertEquals(result, answer);
    }
    @Test
    public void testForSumOfAListUsingWhileLoop(){
        int [] integers = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int result = ArrayFunction.whileLoopSum(integers);
        int answer = 1 + 2 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        assertEquals(result, answer);
    }
    @Test
    public void testForSumOfAListUsingDoWhileLoop() {
        int[] integers = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int result = ArrayFunction.doWhileLoopSum(integers);
        int answer = 1 + 2 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        assertEquals(result, answer);
    }
    @Test
    public void testAFunctionThatConcatenateAListWithAList(){
        int [] integers = {1, 2, 4, 5};
        String [] character = {"a", "b", "c","d","e"};
        String[] result = ArrayFunction.concatenateListWithList(integers, character);
        String[] answer = {"1", "2", "4", "5", "a", "b", "c", "d", "e"};
        assertArrayEquals(result, answer);
    }
    @Test
    public void testThatFunctionThatConcatenateAnArrayWithAnArray(){
        int [] integers = {1, 3, 5, 6, 7};
        String [] chars = {"a", "b", "c", "+"};
        String [] result = ArrayFunction.concatenateListWithList(integers, chars);
        String [] answer = {"1", "3", "5", "6", "7", "a", "b", "c", "+"};
        assertArrayEquals(result, answer);
    }
    @Test
    public void testThatFunctionThatCombinesAnArrayAlternativelyPicking(){
        int [] integers = {1, 2, 4};
        String [] chars = {"a", "b", "c"};
        String[] result = ArrayFunction.combinesList(integers, chars);
        String [] answer = {"a", "1", "b", "2", "c", "4"};
        assertArrayEquals(result, answer);
    }
    @Test
    public void testThatFunctionsOfDifferentLengthCanBeAlternativelyPicked(){
        int [] integers = {1, 2, 4, 5, 6};
        String [] chars = {"a", "b", "c", "d", "e", "f", };
        String[] result = ArrayFunction.combinesList(integers, chars);
        String [] answer = {"a", "1", "b", "2", "c", "4", "d", "5", "e", "6", "f"};
        assertArrayEquals(result, answer);
    }
    @Test
    public void testThatFunctionsOfSameLengthCanBeAlternativelyPicked(){
        int [] integers = {1, 2, 4, 5, 6};
        String [] chars = {"a", "b", "c", "d", "e"};
        String[] result = ArrayFunction.combinesList(integers, chars);
        String [] answer = {"a", "1", "b", "2", "c", "4", "d", "5", "e", "6"};
        assertArrayEquals(result, answer);
    }
    @Test
    public void testForAFunctionWhoTakesInAnIntegerAndConvertItToAListOfArray(){
        int number = 2345;
        int [] result =  ArrayFunction.convertIntegerToList(number);
        int[] convert = {2, 3, 4, 5};
        assertArrayEquals(result, convert);
    }
    @Test
    public void testThatFunctionWhoTakesInAnIntegerAndPassItIntoAnArray(){
        int number = 1245678;
        int [] result = ArrayFunction.convertIntegerToList(number);
        int [] convert = {1, 2, 4, 5, 6, 7, 8};
        assertArrayEquals(result, convert);
    }
    @Test
    public void testSomething(){
        int number = 1245678000;
        int [] result = ArrayFunction.convertIntegerToList(number);
        int [] convert = {1, 2, 4, 5, 6, 7, 8, 0, 0, 0};
        assertArrayEquals(result, convert);
    }
}