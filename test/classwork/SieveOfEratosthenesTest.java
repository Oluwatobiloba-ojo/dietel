package classwork;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SieveOfEratosthenesTest {

    @Test
    public void testForTheSievingOfAListOfNumber(){
        int [] result = Eratosthenes.sieve(1, 10);
        int[] answer = {2, 3, 5, 7};
        assertArrayEquals(result, answer);
    }
    @Test
    public void testForTheSieveOfAListOfNumber2(){
        int [] result = Eratosthenes.sieve(1, 20);
        int[] answer = {2, 3, 5, 7, 11, 13, 17, 19};
        assertArrayEquals(result, answer);
    }

}
