package Snacks;

import java.util.Scanner;

public class ManipulateScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score of the student: ");
        int scores = input.nextInt();
        int total = 0;
        int maximum = 0;
        int minimum = scores;
        int number;
        String odd = "";
        for (number = 1; number < 10; number++) {
            System.out.println("Enter the score of the student: ");
            scores = input.nextInt();
            total += scores;
            if (scores > maximum) {
                maximum = scores;
            }
            if (scores < minimum) {
                minimum = scores;
            }
            if (scores % 2 != 0){
                odd = odd + " " + scores;
            }
        }
            int average = total / number;
            System.out.println("The total of the scores is "+ total);
            System.out.println("The average of the scores is "+ average);
            System.out.println("The minimum of the scores is "+ minimum);
            System.out.println("The maximum of the scores is "+ maximum);
            System.out.println("The odd digit in the scores is "+ odd);
    }
}
