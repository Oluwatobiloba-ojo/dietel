package Snacks;

import java.util.Scanner;

public class AverageOFValidateScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int validate = 0;
        for (int number = 1; number <= 10; number++) {
            System.out.println("Enter the score ");
            int score = input.nextInt();
            if (score >= 1 && score <= 100) {
                total += score;
                validate++;
            }
        }
        int average = total / validate;
        System.out.println("The total of the validate scores is " + average);
    }
}
