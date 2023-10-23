package Snacks;

import java.util.Scanner;

public class PrintScores {
    public static void main(String[] args) {
        String value = " ";
        String range = " ";
        Scanner input = new Scanner(System.in);
        for (int number  = 1; number  <= 10; number ++) {
            System.out.println("Enter scores ");
            int scores = input.nextInt();
            value = String.valueOf(scores);
            range = range + " " + value;
        }
        System.out.println(range);
    }
}
