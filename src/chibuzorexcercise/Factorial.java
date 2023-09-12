package chibuzorexcercise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        int index = 1;
        int container = number;
        for( ; index < number; index++){
           container = container * index;
        }
        System.out.printf("Factorial of this %d is %d",number,container);
    }
}
