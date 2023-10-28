package chapter_seven.knight_game;

import java.util.Scanner;

public class KnightsMain {
    static Scanner input = new Scanner(System.in);
    static Knights myKnights = new Knights();
    public static void main(String[] args) {
        myKnights.setCurrentPositionOnChessBoard();
        myKnights.displayTheKnightChess();
        collectInput();
    }

















    private static void collectInput() {
        for (int count = 0; count < 10; count++) {
            System.out.println("Enter the position between (1 to 8)");
            int moveNumber = input.nextInt();
            if (moveNumber > 1 && moveNumber <= 8) {
                myKnights.moveKnightsMethod(moveNumber - 1);
                myKnights.displayTheKnightChess();
            }else {
                System.out.println("Invalid input:");
            }
        }
    }
}
