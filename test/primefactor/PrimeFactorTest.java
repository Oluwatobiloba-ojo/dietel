package primefactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimeFactorTest {

    @Test
    public void testForTheThePrimeFactorCollectionOfANumber(){
        int number = 24;
        int [] numbers = PrimeFactor.prime(number);
        int[] answer = {2, 2, 2, 3};
        assertArrayEquals(answer, numbers);
    }
    @Test
    public void testForThePrimeFactorCollectionOfNumber2(){
        int number = 25;
        int [] result = PrimeFactor.prime(number);
        int[] answer = {5, 5};
        assertArrayEquals(result, answer);
    }
    @Test
    public void testForThePrimeFactorOfANumber(){
        int number = 21;
        int[] result = PrimeFactor.prime(number);
        int[] answer = {3, 7};
        assertArrayEquals(result, answer);
    }
    @Test
    public void testForThePrimeFactorOfANumber2(){
        int number = 12;
        int[] result = PrimeFactor.prime(number);
        int[] answer = {2, 2, 3};
        assertArrayEquals(answer, result);
    }
}
