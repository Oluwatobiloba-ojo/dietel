package chapter_seven.knight_game;

import java.util.Arrays;

import static chapter_seven.knight_game.MovePosition.*;

public class Knights {
    private final String[][] knightsChess = new String[8][8];
    private final String[] ALPHABETS =
            {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                    "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            };
    private int currentRow = 3;
    private int currentColumn = 4;
    static int[] horizontal = new int[8];
    static int[] vertical = new int[8];
    int numberOfCount = 1;
    public Knights(){
        for (int count = 0; count < knightsChess.length; count++){
            for (int counter = 0; counter < knightsChess[count].length; counter++){
                knightsChess[count][counter] = "0";
            }
        }
    }

    public void moveKnightsMethod(int moveNumber) {
        setHorizontalAndVertical();
        setCurrentPositionOnChessBoard(3, 4);
        if (moveNumber >= 0 && moveNumber < vertical.length) {
            currentRow += vertical[moveNumber];
            currentColumn += horizontal[moveNumber];
            insertValueOf(currentColumn, currentRow, moveNumber);
        }else throw new IllegalArgumentException("Invalid input");
    }
    public void setBackKnightMove(int movement){
        currentRow -= vertical[movement];
        currentColumn -= horizontal[movement];
    }

    public void insertValueOf(int currentColumn, int currentRow, int movement) {
        if (currentColumn >= 0 && currentColumn < knightsChess.length && currentRow >= 0 && currentRow < knightsChess.length) {
            insertValue(currentColumn, currentRow, movement);
        } else {
            setBackKnightMove(movement);
            throw new ArrayIndexOutOfBoundsException("Square Position not Found in board");
        }
    }
    private void insertValue(int currentColumn, int currentRow, int movement){
        if (knightsChess[currentRow][currentColumn].equals("0")) {
            knightsChess[currentRow][currentColumn] = ALPHABETS[numberOfCount];
            numberOfCount++;
        }else setBackKnightMove(movement);
    }

    public void setCurrentPositionOnChessBoard(int row, int column) {
        knightsChess[row][column] = "K";
    }

    static void setHorizontalAndVertical() {
        horizontal[0] = 2; horizontal[1] = 1; horizontal[2] = -1; horizontal[3] = -2; horizontal[4] = -2;
        horizontal[5] = -1; horizontal[6] = 1; horizontal[7] = 2;
        vertical[0] = -1; vertical[1] = -2; vertical[2] = -2; vertical[3] = -1; vertical[4] = 1;
        vertical[5] = 2; vertical[6] = 2; vertical[7] = 1;
    }

    public int[] checksPositionOfKnights() {
        return new int[]{currentRow, currentColumn};
    }

    public void displayTheKnightChess(){
        for (int square = 0; square < knightsChess.length; square++){
            move1(currentRow, currentColumn, knightsChess);
            move2(currentRow, currentColumn, knightsChess);
            move3(currentRow, currentColumn, knightsChess);
            move4(currentRow, currentColumn, knightsChess);
            move5(currentRow, currentColumn, knightsChess);
            move6(currentRow, currentColumn, knightsChess);
            move7(currentRow, currentColumn, knightsChess);
            move8(currentRow, currentColumn, knightsChess);
            for (int innerSquare = 0; innerSquare < knightsChess[square].length; innerSquare++){
                System.out.print(knightsChess[square][innerSquare] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void setPosition(int number){
        for (int i = 0; i < knightsChess.length; i++) {
            for (int j = 0; j < knightsChess[i].length; j++) {
                if (knightsChess[i][j].equals(String.valueOf(number))){
                    currentRow = i;
                    currentColumn = j;
                }
                knightsChess[i][j] = "0";
            }
        }
    }
    public static void main(String[] args) {
        Knights myKnight = new Knights();
        myKnight.displayTheKnightChess();
    }

    public void insert() {
        knightsChess[currentRow][currentColumn] = ALPHABETS[numberOfCount];
        numberOfCount++;
    }
}
