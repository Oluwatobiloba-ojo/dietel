package chapter_seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SieveOfEratosthenesTest {

    @Test
    void testForAPrimeNumberInAnArrayOfIndexLengthOf100(){
        boolean [] prime = new boolean[100];
        for (int i = 2; i < prime.length ; i++) {
            prime[i] = true;
        }
        int primeNumber =  SieveOfEratosthenes.checkPrimeIndices(prime);
        int answer = 25;
        assertEquals(answer, primeNumber);
    }

    @Test
    void testForAPrimeNUmberInAnArrayOfLength10(){
        boolean [] index = {false, false, true, true, true, true, true, true, true, true};
        int answer = 4;
        int primeNumber = SieveOfEratosthenes.checkPrimeIndices(index);
        assertEquals(primeNumber, answer);
    }

    @Test
    void testForThePrimeNumberWithinZeroToNine() {
        boolean[] index = {false, false, true, true, true, true, true, true, true};
        int answer = 4;
        int primeNumber = SieveOfEratosthenes.checkPrimeIndices(index);
        assertEquals(answer, primeNumber);
    }
}