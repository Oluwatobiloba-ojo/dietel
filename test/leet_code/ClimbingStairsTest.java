package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    public void testThatTheyAreTwoWaysToClimbAStepOf2(){
        int step = 2;
        assertEquals(2, ClimbingStairs.climbStairs(step));
    }
    @Test
    public void testThatTheyAreThreeWaysToClimbAStepOf3(){
        int step = 3;
        assertEquals(3, ClimbingStairs.climbStairs(step));
    }
    @Test
    public void testThatTheyAreFiveWaysToClimbAStairsOf4(){
        int stairs = 4;
        assertEquals(5, ClimbingStairs.climbStairs(stairs));
    }
}