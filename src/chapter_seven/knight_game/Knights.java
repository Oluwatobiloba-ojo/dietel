package chapter_seven.knight_game;

public class Knights {
    private final int[][] knightsChess = new int[8][8];
    private int currentRow = 3;
    private int currentColumn = 4;
    static int[] horizontal = new int[8];
    static int[] vertical = new int[8];
    int numberOfCount = 1;

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

    private void insertValueOf(int currentColumn, int currentRow, int movement) {
        if (currentColumn >= 0 && currentColumn < knightsChess.length && currentRow >= 0 && currentRow < knightsChess.length) {
            insertValue(currentColumn, currentRow, movement);
        } else {
            setBackKnightMove(movement);
            throw new ArrayIndexOutOfBoundsException("Square Position not Found in board");
        }
    }
    private void insertValue(int currentColumn, int currentRow, int movement){
        if (knightsChess[currentRow][currentColumn] == 0) {
            knightsChess[currentRow][currentColumn] = numberOfCount;
            numberOfCount++;
        }else setBackKnightMove(movement);
    }

    public void setCurrentPositionOnChessBoard(int row, int column) {
        knightsChess[row][column] = 10;
    }

    private static void setHorizontalAndVertical() {
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
            for (int innerSquare = 0; innerSquare < knightsChess[square].length; innerSquare++){
                System.out.print(knightsChess[square][innerSquare] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
