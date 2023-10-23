package Snacks;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int range = 1; range <= 10 ; range++) {
            System.out.println("Enter the score:");
            int score = input.nextInt();
            sum += score;
        }
        System.out.println("Sum is " + sum);
    }
}
