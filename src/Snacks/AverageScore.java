package Snacks;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int range;
        for (range = 1; range <= 10 ; range++) {
            System.out.println("Enter the score:");
            int score = scanner.nextInt();
            sum += score;
        }
        double averages = (double) sum / range;
        System.out.printf("The average of the score is %.2f", averages);
    }
}
