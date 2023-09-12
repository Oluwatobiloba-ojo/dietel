package chapter_4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number: ");
        int fiveDigit = input.nextInt();
        while (fiveDigit < 11111 || fiveDigit > 99999) {
            System.out.println("This is an invalid number enter a five digit number: ");
            fiveDigit = input.nextInt();
        }
        int firstOne = fiveDigit / 10000;
        int lastDigit = fiveDigit % 10;

        if (firstOne == lastDigit) System.out.printf("This number %d is a palindrome", fiveDigit);
        else {
            System.out.printf("This number %d is not a palindrome", fiveDigit);
        }
    }
}
