package chapter_seven;

import java.util.Scanner;

public class KnightsMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Knights myKnights = new Knights();
        myKnights.setCurrentPositionOnChessBoard();
        myKnights.displayTheKnightChess();
        for (int count = 0; count < 10; count++) {
            System.out.println("Enter the position between (0 to 7)");
            int moveNumber = input.nextInt();
            myKnights.moveKnightsMethod(moveNumber);
            myKnights.displayTheKnightChess();
        }
    }
}
