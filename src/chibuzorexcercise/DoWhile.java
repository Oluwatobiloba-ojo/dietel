package chibuzorexcercise;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number_one;
        int number_two;
        int stopper;
        do {
            System.out.println("Enter a number");
            number_one = input.nextInt();
            System.out.println("Enter a number");
            number_two = input.nextInt();
            sum = number_one + number_two;
            System.out.println(sum);
            System.out.println("Enter -5 to quit ");
            stopper = input.nextInt();
        }while (stopper != -5);
    }
}
