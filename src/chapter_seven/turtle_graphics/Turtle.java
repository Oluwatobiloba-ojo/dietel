package chapter_seven.turtle_graphics;

public class Turtle {
    private Direction direction = Direction.EAST;
    private final Position position = new Position(0, 0);
    private final String[][] board = new String[20][20];
    private Pen pen = Pen.UP;

    public Pen pen() {
        return pen;
    }
    public void move(int movement) {
        if (movement == 1) pen = Pen.UP;
        else if (movement == 2) pen = Pen.DOWN;
        else if (movement == 3) turnRightMovement();
        else if (movement == 4) turnLeftMovement();
    }

    private void turnLeftMovement() {
        if (direction == Direction.EAST) direction = Direction.NORTH;
        else if (direction == Direction.NORTH) direction = Direction.WEST;
        else if (direction == Direction.WEST) direction = Direction.SOUTH;
        else if (direction == Direction.SOUTH) direction = Direction.EAST;
    }

    private void turnRightMovement() {
        if (direction == Direction.EAST) direction = Direction.SOUTH;
        else if (direction == Direction.SOUTH) direction = Direction.WEST;
        else if (direction == Direction.WEST) direction = Direction.NORTH;
        else if (direction == Direction.NORTH) direction = Direction.EAST;
    }

    public Direction direction() {
        return direction;
    }


    public void moveBy(int space) {
        if (direction == Direction.EAST) movementByEast(space);
        else if (direction == Direction.SOUTH) movementBySouth(space);
        else if (direction == Direction.NORTH) movementByNorth(space);
        else if (direction == Direction.WEST) movementByWest(space);
    }

    private void movementByWest(int space) {
        int column = position.getColumn() - space;
        if (column >= 0) {
            if (pen == Pen.DOWN) {
                inputCharactersIntoBoard(column);
            }
            position.setColumn(column);
        }
        else throw new NoRoadException("Road blocked");
    }

    private void inputCharactersIntoBoard(int column) {
        for (int count = position.getColumn(); count >= column; count--){
            this.board[position.getRow()][count] = "*";
        }
    }

    private void movementByNorth(int space) {
       int row =  position.getRow() - space;
      if (row >= 0){
          if (pen == Pen.DOWN) {
              inputBoardByNorth(row);
          }
          position.setRow(row);
      }
      else throw new NoRoadException("Road blocked");
    }

    private void inputBoardByNorth(int row) {
        for (int count = position.getRow(); count >= row; count--){
            this.board[count][position.getColumn()] = "*";
        }
    }

    private void movementBySouth(int space) {
        int row = position.getRow() + space;
        if (row < this.board.length){
            if (pen == Pen.DOWN) {
                inputBoardBySouth(row);
            }
            position.setRow(row);
        }
    }

    private void inputBoardBySouth(int row) {
        for (int count = position.getRow(); count < row; count++){
            this.board[count][position.getColumn()] = "*";
        }
    }

    private void movementByEast(int space) {
        int column = position.getColumn() + space;
        if (column <= this.board.length) {
            inputBoardEast(column);
            position.setColumn(column);
        }
    }

    private void inputBoardEast(int column) {
        for (int count = position.getColumn(); count <= column; count++){
            this.board[position.getRow()][count] = "*";
        }
    }

    public int[] getPosition() {
        return position.getPosition();
    }

    public void getBoard(){
        for (String[] strings : this.board) {
            for (String string : strings) {
                if ("*".equals(string)) {
                    System.out.print(string + "\t");
                } else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
