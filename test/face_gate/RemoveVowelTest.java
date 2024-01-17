package selfassesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveVowelTest {

    @Test
    public void testThatWhenAStringWhichContainVowelWillReturnAStringWithoutVowel(){
        String alpha = "alpha";
        assertEquals("lph", FaceGate.removeVowel(alpha));
    }
    @Test
    public void testThatWhenAStringDoNotHaveVowelSoundReturnTheWord(){
        String word = "shy";
        assertEquals(word, FaceGate.removeVowel(word));
    }
    @Test
    public void testThatWhenWhenAStringWhichHaveAnUpperCaseOfVowelSoundReturnStringOfTheWordWithoutString() {
        String word = "BAthDro";
        assertEquals("BthDr", FaceGate.removeVowel(word));
    }
    @Test
    public void testThatWhenAASAStringWouldReturnStringWithoutVowel(){
        String word = "A";
        assertEquals("", FaceGate.removeVowel(word));
    }


}