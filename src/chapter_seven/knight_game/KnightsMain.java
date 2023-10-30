package chapter_seven.knight_game;
import static chapter_seven.knight_game.KnightExceptionalHandling.exceptions;
public class KnightsMain {
    static Knights myKnights = new Knights();
    public static void main(String[] args) {
        myKnights.setCurrentPositionOnChessBoard(3, 4);
        myKnights.displayTheKnightChess();
        collectInput();
    }

















    private static void collectInput() {
        for (int count = 0; count < 10; count++) {
            exceptions();
        }
    }
}
