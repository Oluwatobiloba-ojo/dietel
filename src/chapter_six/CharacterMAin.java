package chapter_six;

import java.util.Scanner;

import static chapter_six.SquareCharacters.displayCharSquare;

public class CharacterMAin {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character you want us to display: ");
        char fill = input.next().charAt(0);
        System.out.println("Enter the length of the square: ");
        int lengthOfSquare = input.nextInt();
        displayCharSquare(lengthOfSquare, fill);
    }
}
