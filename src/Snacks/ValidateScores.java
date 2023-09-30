package Snacks;

import java.util.Scanner;

public class ValidateScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        for (int number = 1; number <= 10; ){
            System.out.println("Enter a score of the student ");
            int scores = input.nextInt();
            if (scores >= 1 && scores <= 100){
                total += scores;
                number++;
            }
        }
        System.out.println("The sum of the scores is " + total);
    }
}
