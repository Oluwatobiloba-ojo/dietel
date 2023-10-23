package Snacks;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int range;
        for (range = 1; range <= 10 ; range++) {
            System.out.println("Enter the score:");
            int score = input.nextInt();
            sum += score;
        }
        double average = (double) sum / range;
        System.out.printf("The sum of this score is %d\n", sum);
        System.out.printf("The average of this score is %.2f ", average);
    }
}
