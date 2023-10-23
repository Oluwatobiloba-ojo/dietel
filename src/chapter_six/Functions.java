package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Functions {

    public static boolean isPalindrome(int number) {
        String value = String.valueOf(number);
        String isPalindrome = "";
        for (int num = value.length() - 1; num >= 0 ; num--) {
            isPalindrome += value.charAt(num);
        }
        return value.equals(isPalindrome);
    }

    public static boolean isPrimeNumber(int number) {
         int numberOfFactor = NoOfFactorsNumber(number);
        return numberOfFactor == 2;
    }

    private static int NoOfFactorsNumber(int number) {
        int count = 0;
        for (int num = 1; num <= number ; num++) {
            if (number % num == 0){
                count++;
            }
        }
        return count;
    }
}
