package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingPortionOfStringTest {

    @Test
    public void testThatTheCompareCharacterBetweenTwoCharacterReturnTrue(){
        String firstWord = "Nation";
        String secondWord = "Ration";
        assertTrue(ComparingPortionOfString.regionComparison(firstWord, secondWord, 2, 4));
    } @Test
    public void testThatTheCompareCharacterInTheStringBetweenTwoCharacterReturnTrue(){
        String firstWord = "Mouse";
        String secondWord = "Louse";
        assertTrue(ComparingPortionOfString.regionComparison(firstWord, secondWord, 1, 4));
    }



}