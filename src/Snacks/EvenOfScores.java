package Snacks;

import java.util.Scanner;

public class EvenOfScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int number = 1; number <= 10; number++){
            System.out.println("Enter the scores: ");
            int scores = scanner.nextInt();
            if (scores % 2 == 0){
                total += scores;
            }
        }
        System.out.println("The even numbers in the scores is " + total);
    }
}
