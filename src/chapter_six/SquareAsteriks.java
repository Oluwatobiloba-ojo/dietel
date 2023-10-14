package chapter_six;

import java.util.Scanner;

public class SquareAsteriks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the side of square you want ");
        int numberOfSquare = input.nextInt();
        squareOfAstericks(numberOfSquare);
    }

    private static void squareOfAstericks(int numberOfSquare) {
        for (int length = 0; length < numberOfSquare ; length++) {
            System.out.println();
            for (int breadth = 0; breadth < numberOfSquare; breadth++) {
                System.out.print(" *");
            }
        }
    }
}
