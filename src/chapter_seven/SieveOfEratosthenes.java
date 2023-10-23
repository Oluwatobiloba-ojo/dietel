package chapter_seven;

public class SieveOfEratosthenes {


    public static int checkPrimeIndices(boolean[] prime) {
        for (int index = 2; index < prime.length; index++) {
            for (int multiple = index + index; multiple < prime.length ; multiple+= index) {
                prime[multiple] = false;
            }
        }
        int length;
        length = calculateNumbersOfThoseTrue(prime);
        return length;
    }


    private static int calculateNumbersOfThoseTrue(boolean[] prime) {
        int length = 0;
        for (boolean b : prime) {
            if (b) {
                length++;
            }
        }
        return length;
    }
}
