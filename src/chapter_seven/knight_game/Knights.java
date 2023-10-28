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
        setCurrentPositionOnChessBoard();
        for (int count = 0; count < knightsChess.length; count++) {
            int replicate = currentRow;
            for (int counter = 0; counter < knightsChess[count].length; counter++) {
                if (count == currentRow && counter == currentColumn && knightsChess[currentRow + vertical[moveNumber]]
                        [currentColumn + horizontal[moveNumber]] == 0) {
                    currentRow += vertical[moveNumber];
                    currentColumn += horizontal[moveNumber];
                    insertAdditionalRowAndColumn(currentColumn, currentRow);
                    counter = knightsChess[count].length;
                }
            }
            if (count == replicate) count = knightsChess.length;
        }
    }

    private void insertAdditionalRowAndColumn(int currentColumn, int currentRow) {
        knightsChess[currentRow][currentColumn] = numberOfCount;
        numberOfCount++;
    }

    public void setCurrentPositionOnChessBoard() {
        knightsChess[3][4] = 10;
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
