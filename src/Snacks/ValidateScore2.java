package Snacks;

import java.util.Scanner;

public class ValidateScore2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        for (int number = 1; number <= 10; number++) {
            System.out.println("Enter the score ");
            int score = input.nextInt();
            if (score >= 1 && score <= 100){
                total += score;
            }
        }
        System.out.println("The sum of the score is "+ total);
    }
}
