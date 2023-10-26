package chapter_seven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurtleGraphicsTest {
    Turtle myTurtle;
    @BeforeEach
    public void setMyTurtle(){
        myTurtle = new Turtle();
    }


    @Test
    public void testForThatWhenAPenIsUpTheTurtleDoesNotWriteAnyShapeMoving(){
        myTurtle.penUp();
        assertArrayEquals(new int[]{0, 0}, myTurtle.checkPosition());
    }

    @Test
    public void testForThatWhenAPenIsDownTheTurtleWriteDownShapeMoving(){
        myTurtle.penUp();
        assertArrayEquals(new int[]{0, 0}, myTurtle.checkPosition());
        myTurtle.moveRight();
        myTurtle.penDown();
        assertArrayEquals(new int[]{0, 1},myTurtle.checkPosition());
        assertEquals(1, myTurtle.checkForShapes());
    }

    @Test
    public void testForWhenPenIsUpItMovesButDoesNotDrawOutShapes(){
        myTurtle.moveRight();
        myTurtle.moveRight();
        myTurtle.penUp();
        assertArrayEquals(new int[]{0, 2}, myTurtle.checkPosition());
        myTurtle.moveRight();
        myTurtle.penUp();
        assertArrayEquals(new int[]{0, 3}, myTurtle.checkPosition());
        assertEquals(0, myTurtle.checkForShapes());
    }

    @Test
    public void testForWhenPenIsUpAndItsMoveRightForTwentyTimesItMovesToTheNextRow(){
        for (int count = 0; count < 20; count++){
            myTurtle.moveRight();
            myTurtle.penDown();
        }
        assertArrayEquals(new int[]{1, 0},myTurtle.checkPosition());
    }

    @Test
    public void testForWhenItHasNotMoveRightItCantMoveLeft(){
        myTurtle.moveLeft();
        myTurtle.penUp();
        myTurtle.moveRight();
        assertArrayEquals(new int[]{0, 1}, myTurtle.checkPosition());
    }

    @Test
    public void testForMovementOf10SpacesWithinTheSquare(){
        myTurtle.penDown();
        myTurtle.moveSpaces(); // row = 0, column = 10
        myTurtle.moveSpaces(); // row = 1, column = 10
        myTurtle.penDown();
        assertArrayEquals(new int[]{1, 10}, myTurtle.checkPosition());
        assertEquals(2, myTurtle.checkForShapes());
    }


}
