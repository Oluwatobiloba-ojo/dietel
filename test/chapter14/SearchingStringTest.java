package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchingStringTest {

    @Test
    public void testThatNumberOfOccurrenceOflInHelloIs2(){
        String word = "Hello";
        String character = "l";
        assertEquals(2, SearchingString.numberOfOccurrence(word, character));
    }
    @Test
    public void testThatTheNumberOfOccurrenceOfYInByeIS1(){
        String word  = "Bye";
        String character = "y";
        assertEquals(1, SearchingString.numberOfOccurrence(word, character));
    }
    @Test
    public void testThatTheNumberOfOccurrenceOfACharacterSWhichIsNotInByeReturnMinus1(){
        String word  = "Bye";
        String character = "s";
        assertEquals(-1, SearchingString.numberOfOccurrence(word, character));
    }

}