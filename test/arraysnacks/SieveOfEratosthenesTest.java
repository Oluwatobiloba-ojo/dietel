package arraysnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SieveOfEratosthenesTest {

    @Test
    void testForAPrimeNumberInAnArrayOfIndex(){
        boolean [] prime = new boolean[100];
        for (int i = 2; i < prime.length ; i++) {
            prime[i] = true;
        }
        int primeNumber =  SieveOfEratosthenes.checkPrimeIndices(prime);
        int answer = 25;
        assertEquals(answer, primeNumber);
    }

    @Test
    void testForAPrimeNUmberInAnArrayOfIndices2(){
        boolean [] index = {false, false, true, true, true, true, true, true, true, true};
        int answer = 4;
        int primeNumber = SieveOfEratosthenes.checkPrimeIndices(index);
        assertEquals(primeNumber, answer);
    }

    @Test
    void testForThePrimeNumberUsingSieveOfEratosthenes(){
        boolean [] index = {false, false, true, true, true, true,true,true,true};
        int answer = 4;
        int primeNumber = SieveOfEratosthenes.checkPrimeIndices(index);
        assertEquals(answer, primeNumber);
    }

}