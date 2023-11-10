package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EliminateNumberOfMonsterTest {

    @Test
    public void testForThatTheEliminationOfMonsterBasedOnTheSpeedOfWeapon(){
        int[] distanceOfMonster = {1, 3, 4};
        int[] speed = {1, 1, 1};
        assertEquals(3, EliminateNumberOfMonster.eliminateMaximum(distanceOfMonster, speed));
    }

    @Test
    public void testForTheEliminationOfMaximumDistanceOfMonster(){
        int[] distanceOfMonster = {1, 1, 2, 3};
        int[] speed = {1, 1, 1, 1};
        assertEquals(1, EliminateNumberOfMonster.eliminateMaximum(distanceOfMonster, speed));
    }

    @Test
    public void testForTheEliminationOfMaximumDistanceOf(){
        int[] distanceOfMonster = {3, 2, 4};
        int[] speed = {5, 3, 2};
        assertEquals(1, EliminateNumberOfMonster.eliminateMaximum(distanceOfMonster, speed));
    }
    @Test
    public void testForTheEliminationOfMaximumDistanceOfWithDifferentSpeed(){
        int[] distanceOfMonster = {3,5,7,4,5};
        int[] speed = {2,3,6,3,2};
        assertEquals(2, EliminateNumberOfMonster.eliminateMaximum(distanceOfMonster, speed));
    }

}