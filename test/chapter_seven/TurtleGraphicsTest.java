package chapter_seven;

import chapter_seven.turtle_graphics.Direction;
import chapter_seven.turtle_graphics.NoRoadException;
import chapter_seven.turtle_graphics.Pen;
import chapter_seven.turtle_graphics.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphicsTest {
    Turtle ijapa;
    @BeforeEach
    public void setMyTurtle(){
        ijapa = new Turtle();
    }

    @Test
    public void testThatATurtlePenIsDown(){
        assertSame(Pen.UP, ijapa.pen());
    }

    @Test
    public void testThatTurtleMovePenDownWhenItPress2(){
        ijapa.move(2);
        assertSame(Pen.DOWN, ijapa.pen());
    }

    @Test
    public void testThatTurtlePenWillBeDownOnlyWhenOperation2IsPress(){
        ijapa.move(5);
        assertSame(Pen.UP, ijapa.pen());
    }

    @Test
    public void testThatTurtleDirectionIsAlwaysStartingFromEast(){
        assertSame(Direction.EAST, ijapa.direction());
    }

    @Test
    public void testThatTurtleChangeDirectionWhenItMoveRight(){
        ijapa.move(2);
        ijapa.move(3);
        assertSame(Direction.SOUTH, ijapa.direction());
    }

    @Test
    public void testThatTurtleChangeDirectionToWestWhenMoveRightTwice(){
        ijapa.move(2);
        ijapa.move(3);
        ijapa.move(3);
        assertSame(Direction.WEST, ijapa.direction());
    }

    @Test
    public void testThatTurtleChangeDirectionToNorthWhenItMoveThrice(){
        ijapa.move(2);
        ijapa.move(3);
        ijapa.move(3);
        ijapa.move(3);
        assertSame(Direction.NORTH, ijapa.direction());
    }

    @Test
    public void testThatTurtleCanChangeDirectionAndMoveLeftToNorth(){
        ijapa.move(2);
        ijapa.move(4);
        assertSame(Direction.NORTH, ijapa.direction());
    }

    @Test
    public void testForTheChangeOfMovements(){
        ijapa.move(2);
        ijapa.move(4);
        ijapa.move(4);
        ijapa.move(4);
        ijapa.move(3);
        ijapa.move(3);
        assertSame(Direction.NORTH, ijapa.direction());
    }

    @Test
    public void testForTheCombinationOfRightAndLeftMovement(){
        ijapa.move(2);
        ijapa.move(3);
        ijapa.move(3);
        ijapa.move(3);
        ijapa.move(4);
        ijapa.move(4);
        assertSame(Direction.SOUTH, ijapa.direction());
    }

    @Test
    public void testForTheTurtleThatMovesByInAEastDirection(){
        assertSame(Direction.EAST, ijapa.direction());
        ijapa.move(2);
        ijapa.moveBy(12);
        System.out.println(Arrays.toString(ijapa.getPosition()));
        assertArrayEquals(new int[]{0, 12}, ijapa.getPosition());
    }

    @Test
    public void testForTheTurtleWhichIsOnDirectionSouth(){
        ijapa.move(2);
        assertSame(Pen.DOWN, ijapa.pen());
        assertSame(Direction.EAST, ijapa.direction());
        ijapa.move(3);
        assertSame(Direction.SOUTH, ijapa.direction());
        ijapa.moveBy(12);
        assertArrayEquals(new int[]{12,0}, ijapa.getPosition());
    }

    @Test
    public void testForWhenTheTurtleIsAtNorthAndMoveBy3(){
        ijapa.move(2);
        assertSame(Direction.EAST, ijapa.direction());
        ijapa.move(3);
        ijapa.moveBy(4);
        System.out.println(Arrays.toString(ijapa.getPosition()));
        assertArrayEquals(new int[]{4, 0}, ijapa.getPosition());
        ijapa.move(3);
        ijapa.move(3);
        ijapa.moveBy(4);
        assertArrayEquals(new int[]{0, 0}, ijapa.getPosition());
    }

    @Test
    public void testForWhenThereIsNoWayInTheDirectionIsMovingThrowException(){
        ijapa.move(2);
        ijapa.move(4);
        assertThrows(NoRoadException.class, ()-> ijapa.moveBy(29));
        assertArrayEquals(new int[]{0, 0}, ijapa.getPosition());
    }

    @Test
    public void testForTheTurtleGraphicsApp(){
        ijapa.move(2);
        ijapa.moveBy(12);
        ijapa.move(3);
        ijapa.moveBy(12);
        ijapa.move(3);
        ijapa.moveBy(12);
        ijapa.move(3);
        ijapa.moveBy(12);
        ijapa.getBoard();
        assertSame(ijapa.direction(), Direction.NORTH);
    }
}
