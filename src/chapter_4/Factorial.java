package chapter_4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int factorial = 1;
        while (number < 0){
            System.out.println("Enter a positive number:");
            number = input.nextInt();
        }
        for (int row = number; row > 1; row--){
            factorial *= row;
        }
        System.out.printf("The factorial of the non negative %d is %d ", number,factorial);
    }
}
