package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionTest {
    @Test
    public void test_That_Number_Is_Even(){
        boolean result = Function.isEven(2);
        assertTrue(result);
    }

    @Test
    public void testThatWhenNumberEnteredIsOddReturnFalse(){
        boolean result = Function.isEven(3);
        assertFalse(result);
    }

    @Test
    public void testThatZeroIsAnEvenNumber(){
        boolean result = Function.isEven(0);
        assertTrue(result);
    }

    @Test
    public void testThatFunctionPrimeNumberTellsWhenANumberIsPrime(){
        boolean result = Function.prime(3);
        assertTrue(result);
    }

    @Test
    public void testThatOneIsNotAPrimeNumber(){
        boolean result = Function.prime(1);
        assertFalse(result);
    }

    @Test
    public void testThatOneNumberMinusSecondNumberWillBeAPositiveValue(){
        int result = Function.subtraction(7,3);
        assertEquals(4,result);
    }
    @Test
    public void testThatDifferenceBetweenASmallerFirstNumberAndHigherSecondNumberWillGivePositiveValue(){
        int result = Function.subtraction(3,7);
        assertEquals(4,result);
    }

    @Test
    public void testThatDivideOfTwoNumbersGiveOutResultInDecimalPlaces(){
        double result = Function.division(1,2);
        assertEquals(0.50,result);
    }

    @Test
    public void testThatDivideOfTwoNumbersGiveOutResultOfTwoDecimalPlaces(){
        double result = Function.division(5,6);
        assertEquals(0.833,result);
    }

    @Test
    public void testNoOfFactorsOfANumber(){
        int result = Function.factors(10);
        assertEquals(4,result);
    }

    @Test
    public void testThatANumberIsASquared(){
        boolean result = Function.squared(25);
        assertTrue(result);
        boolean result2 = Function.squared(134);
        assertFalse(result2);
    }

    @Test
    public void testThatWhenANumberIsAFiveDigitCanAlsoNotBeAPalindrome(){
        boolean result = Function.palindrome(22245);
        assertFalse(result);
    }

    @Test
    public void testThatEvenFiveDigitValueWhenReversedMustBeTheSameAsTheNumber(){
        boolean result = Function.palindrome(13241);
        assertFalse(result);
        boolean result2 = Function.palindrome(12221);
        assertTrue(result2);
    }

    @Test
    public void testThatFactorialOfNumberReturnsTheValue(){
        int result = Function.factorial(5);
        assertEquals(120,result);
    }
}
