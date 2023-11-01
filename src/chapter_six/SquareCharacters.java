package chapter_six;

import java.util.Scanner;

public class SquareCharacters {
    public static void displayCharSquare(int lengthOfSquare, char fill) {
        for (int length = 0; length < lengthOfSquare ; length++) {
            System.out.println();
            for (int breadth = 0; breadth < lengthOfSquare; breadth++) {
                System.out.print(fill+ " ");
            }
        }
    }
}
