package chapter_six;

import java.util.Scanner;

public class SquareCharacters {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character you want us to display: ");
        char fill = input.next().charAt(0);
        System.out.println("Enter the length of the square: ");
        int lengthOfSquare = input.nextInt();
        displayCharSquare(lengthOfSquare, fill);
    }

    private static void displayCharSquare(int lengthOfSquare, char fill) {
        for (int length = 0; length < lengthOfSquare ; length++) {
            System.out.println();
            for (int breadth = 0; breadth < lengthOfSquare; breadth++) {
                System.out.print(fill+ " ");
            }
        }
    }
}
