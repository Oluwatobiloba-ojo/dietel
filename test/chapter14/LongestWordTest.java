package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordTest {

    @Test
    public void testThatTheLongestWordInTheSentenceIsFather(){
        String sentence = "I am a boy i live in my father house";
        String longestWord = "father";
        assertEquals(longestWord, LongestWord.maximumCharacterIn(sentence));
    }
    @Test
    public void testThatTheLongestWordInTheSentenceIsHallelujah(){
        String sentence = "Praise the lord Hallelujah";
        String longestWord = "Hallelujah";
        assertEquals(longestWord, LongestWord.maximumCharacterIn(sentence));
    }
    @Test
    public void testThatTheLongestWordInTheSentenceAreTwoItPicksTheFirstOccurrence(){
        String sentence = "Praise the lord Yeshua";
        String longestWord = "Praise";
        assertEquals(longestWord, LongestWord.maximumCharacterIn(sentence));
    }


}