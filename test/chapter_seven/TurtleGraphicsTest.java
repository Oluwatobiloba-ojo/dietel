package chapter_seven;

import chapter_seven.turtle_graphics.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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
        Throwable throwable = assertThrows(IllegalArgumentException.class, ()->{
            myTurtle.moveLeft();
        });
        assertEquals("No movement at all", throwable.getMessage());
        myTurtle.penUp();
        myTurtle.moveRight();
        assertArrayEquals(new int[]{0, 1}, myTurtle.checkPosition());
    }

    @Test
    public void testForMovementOf10SpacesWithinTheSquare(){
        myTurtle.penDown();
        myTurtle.moveSpaces();
        myTurtle.moveSpaces();
        myTurtle.penDown();
        assertArrayEquals(new int[]{1, 10}, myTurtle.checkPosition());
        assertEquals(2, myTurtle.checkForShapes());
    }


}
