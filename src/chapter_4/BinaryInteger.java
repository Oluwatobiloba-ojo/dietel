package chapter_4;

import java.util.Scanner;

public class BinaryInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary digit: ");
        int binaryDigit = scanner.nextInt();
        String strDigit = String.valueOf(binaryDigit);
        int length = strDigit.length();
        int total = 1;
        int sum = 0;
        int constant = 2;
        for (int number = 1; number < length; number++){
            total *= 10;
        }
        int value = binaryDigit / total;
        int multiply = constant * value;
        sum += multiply;

        int total2 = total / 10;
        for (int number = total2; number > 0; number = number / 10){
            int input = binaryDigit / number % 10;
            sum += input;
            sum *= constant;
        }
        int result = sum / 2;
        System.out.println("The decimal equivalence of " + binaryDigit +" "+ result);
    }
}
