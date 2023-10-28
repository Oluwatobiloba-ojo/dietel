package chapter_seven.turtle_graphics;

public class Turtle {

    private final int[][] turtleMove = new int[20][20];
    int row = 0;
    final static int shapesMove = 10;
    final static int moveRightAndLeft = 1;
    int column = 0;
    public void penUp() {
    turtleMove[row][column] = 0;
    }

    public int[] checkPosition() {
        return new int[]{row, column};
    }

    public void penDown() {
        turtleMove[row][column] = 1;
    }

    public void moveRight() {
        if (column >= turtleMove[0].length){
            moveRow();
            column = 0;
        }else column += moveRightAndLeft;
    }

    private void moveRow() {
        row += moveRightAndLeft;
    }

    public int checkForShapes() {
        int shapes = 0;
        for (int shape = 0; shape < turtleMove.length; shape++){
            for (int innerSquare = 0; innerSquare < turtleMove[shape].length; innerSquare++){
                if (turtleMove[shape][innerSquare] != 0){
                    shapes += 1;
                }
            }
        }
        return shapes;
    }

    public void moveLeft() {
        if (column > 0){
            column -= moveRightAndLeft;
        }
    }

    public void moveSpaces() {
        if (column >= shapesMove){
            moveRow();
            column = shapesMove;
        }else column += shapesMove;
    }

    public void displayShapesMoveWhenPenIsDown(){
        for (int i = 0; i < turtleMove.length; i++) {
            for (int j = 0; j < turtleMove[i].length; j++) {
                if (turtleMove[i][j] == 1) {
                    System.out.print("*" + "\t");
                } else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
