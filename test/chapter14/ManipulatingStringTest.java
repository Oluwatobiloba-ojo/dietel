package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManipulatingStringTest {

    @Test
    public void testThatAStringWhichDoesNotContainSpecialCharacterReturnFalse(){
        String word = "Olawa12";
        assertFalse(ManipulatingString.isContainSpecialCharacter(word));
    }
    @Test
    public void testThatAStringWhichContainSpecialCharacterReturnTrue(){
        String word = "Tobi@123";
        assertTrue(ManipulatingString.isContainSpecialCharacter(word));
    }

    @Test
    public void testThatAStringWhichContainOnlyNumberReturnFalse(){
        String word = "1237593833780270";
        assertFalse(ManipulatingString.isContainSpecialCharacter(word));
    }
}