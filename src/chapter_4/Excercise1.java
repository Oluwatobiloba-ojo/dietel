package chapter_4;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        int count = 0;
        while (count != 11) {
            if (number > 0) {
                System.out.println("Enter a number: ");
                number = input.nextInt();
                sum += number;
                System.out.println("sum is" + " " + sum);
                count++;
            }
        }
    }
}
