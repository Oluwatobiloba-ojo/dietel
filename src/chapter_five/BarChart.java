package chapter_five;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter a number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter a number: ");
        int thirdNumber = input.nextInt();

        for (int index = 1; index <= firstNumber; index++){
            System.out.print(" * ");
        }
        System.out.println();
        for (int count = 1; count <= secondNumber; count++){
            System.out.print(" * ");
        }
        System.out.println();
        for (int index = 1; index <= thirdNumber; index++){
            System.out.print(" * ");
        }
    }
}
