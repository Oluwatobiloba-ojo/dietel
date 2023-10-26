package chapter_seven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KnightsTest {
    Knights myKnights;
    @BeforeEach
    public void setMyKnights(){
        myKnights = new Knights();
    }

    @Test
    public void testForCurrentMovement(){
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
    public void testThatAPotentialMoveToEnsureTheSquareIsNotFilled(){
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
}
