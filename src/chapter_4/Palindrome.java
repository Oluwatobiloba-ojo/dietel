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
        int secondDigit = fiveDigit / 1000 % 10;
        int thirdDigit = fiveDigit / 100 % 10;
        int fourDigit = fiveDigit / 10 % 10;
        int lastDigit = fiveDigit % 10;

        String firstValue = String.valueOf(firstOne);
        String secondValue = String.valueOf(secondDigit);
        String thirdValue = String.valueOf(thirdDigit);
        String fourValue = String.valueOf(fourDigit);
        String lastValue = String.valueOf(lastDigit);

        String palindrome = lastValue + fourValue + thirdValue + secondValue + firstValue;
        int replicate = Integer.parseInt((palindrome));
        if (fiveDigit == replicate) System.out.printf("This number %d is a palindrome", fiveDigit);
        else {
            System.out.printf("This number %d is not a palindrome", fiveDigit);
        }
    }
}
