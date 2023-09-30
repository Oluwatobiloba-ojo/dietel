package Snacks;

import java.util.Scanner;

public class AverageOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int even = 0;
        int total = 0;
        for (int number = 1; number <= 10; number++){
            System.out.println("Enter the scores: ");
            int scores = scanner.nextInt();
            if (scores % 2 == 0){
                total += scores;
                even++;
            }
        }
        double average =(double) total / even;
        System.out.println("The average of the even in the scores is " + average);
    }
}
