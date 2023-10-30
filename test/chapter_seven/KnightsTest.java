package chapter_seven;

import chapter_seven.knight_game.Knights;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KnightsTest {
    Knights myKnights;
    @BeforeEach
    public void setMyKnights(){
        myKnights = new Knights();
    }

    @Test
    public void testForCurrentPosition(){
        int[] currentPosition = myKnights.checksPositionOfKnights();
        int[] current = {3, 4};
        assertArrayEquals(current, currentPosition);
    }

    @Test
    public void testForTheMovementOfAKnight(){
        int moveNumber = 0;
        myKnights.moveKnightsMethod(moveNumber);
        int[] checkPosition = myKnights.checksPositionOfKnights();
        int[] answerForCurrentPosition = {2, 6};
        assertArrayEquals(checkPosition, answerForCurrentPosition);
    }

    @Test
    public void testForTheMovementOfAKnightDiffers(){
        int moveNumber = 1;
        myKnights.moveKnightsMethod(moveNumber);
        int[] checkPosition = myKnights.checksPositionOfKnights();
        int[] answer = {1, 5};
        assertArrayEquals(answer, checkPosition);

        int secondMove = 0;
        myKnights.moveKnightsMethod(secondMove);
        int[] finalPosition = myKnights.checksPositionOfKnights();
        int[] finalAnswer = {0, 7};
        assertArrayEquals(finalPosition, finalAnswer);
    }
    @Test
    public void testThatAPotentialMoveToEnsureTheSquareItMovedIsNotFilled(){
        int[] currentPosition = myKnights.checksPositionOfKnights();
        assertArrayEquals(currentPosition, new int[]{3, 4});

        int moveNumber = 1;
        myKnights.moveKnightsMethod(moveNumber);
        int[] checkPosition = myKnights.checksPositionOfKnights();
        int[] position = {1, 5};
        assertArrayEquals(position, checkPosition);

        int secondMove = 5;
        myKnights.moveKnightsMethod(secondMove);
        assertArrayEquals(myKnights.checksPositionOfKnights(), new int[]{1, 5});
    }
    @Test
    public void testForMoveNumberThatMoveNumberIsBetweenZeroAndSeven(){
        int moveNumber = 8;
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->{
            myKnights.moveKnightsMethod(moveNumber);
    });
        assertEquals("Invalid input", exception.getMessage());
        assertArrayEquals(new int[]{3, 4},myKnights.checksPositionOfKnights());
    }

       @Test
    public void testForIndexOutOfBoundFreeInAMove(){
        int moveNumber = 0;
        myKnights.moveKnightsMethod(moveNumber);
        int[] position = myKnights.checksPositionOfKnights();
        int[] result = {2, 6};
        assertArrayEquals(result, position);

        int move = 0;
        Throwable throwable = assertThrows(ArrayIndexOutOfBoundsException.class, ()-> {
            myKnights.moveKnightsMethod(move);
                });
        assertEquals("Square Position not Found in board", throwable.getMessage());
       }

}
