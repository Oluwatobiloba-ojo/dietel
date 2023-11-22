package chapter_seven.knight_game;

import static chapter_seven.knight_game.Knights.*;

public class MovePosition {

    public static void move1(int currentRow, int currentColumn, String[][] knightsChess) {
        setHorizontalAndVertical();
        int row = currentRow + vertical[0];
        int  column = currentColumn + horizontal[0];
        if (row >= 0 && column < 8 && column >= 0 && row < 8){
            knightsChess[row][column] = "1";
        }
    }
    public static void move2(int currentRow, int currentColumn, String[][] knightsChess){
        setHorizontalAndVertical();
        int row = currentRow + vertical[1];
        int  column = currentColumn + horizontal[1];
        if (column >= 0 && column < 8 && row >= 0 && row < 8){
            knightsChess[row][column] = "2";
        }
    }
    public static void move3(int currentRow, int currentColumn, String[][] knightsChess){
        setHorizontalAndVertical();
        int row = currentRow + vertical[2];
        int  column = currentColumn + horizontal[2];
        if (column >= 0 && column < 8 && row >= 0 && row < 8){
            knightsChess[row][column] = "3";
        }
    }
    public static void move4(int currentRow, int currentColumn, String[][] knightsChess){
        setHorizontalAndVertical();
        int row = currentRow + vertical[3];
        int  column = currentColumn + horizontal[3];
        if (column >= 0 && column < 8 && row >= 0 && row < 8){
            knightsChess[row][column] = "4";
        }
    }
    public static void move5(int currentRow, int currentColumn, String[][] knightsChess){
        setHorizontalAndVertical();
        int row = currentRow + vertical[4];
        int  column = currentColumn + horizontal[4];
        if (column >= 0 && column < 8 && row >= 0 && row < 8){
            knightsChess[row][column] = "5";
        }
    }
    public static void move6(int currentRow, int currentColumn, String[][] knightsChess){
        setHorizontalAndVertical();
        int row = currentRow + vertical[5];
        int  column = currentColumn + horizontal[5];
        if (column >= 0 && column < 8 && row >= 0 && row < 8){
            knightsChess[row][column] = "6";
        }
    }
    public static void move7(int currentRow, int currentColumn, String[][] knightsChess){
        setHorizontalAndVertical();
        int row = currentRow + vertical[6];
        int  column = currentColumn + horizontal[6];
        if (column >= 0 && column < 8 && row >= 0 && row < 8){
            knightsChess[row][column] = "7";
        }
    }
    public static void move8(int currentRow, int currentColumn, String[][] knightsChess){
        setHorizontalAndVertical();
        int row = currentRow + vertical[7];
        int  column = currentColumn + horizontal[7];
        if (column >= 0 && column < 8 && row >= 0 && row < 8){
            knightsChess[row][column] = "8";
        }
    }
}
