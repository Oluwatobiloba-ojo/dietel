package leet_code;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LengthOfLastWordTest {
    @Test
    public void testThatTheLengthOfALastWordIs5(){
        String input = "Hello World";
        assertEquals(5, LengthOfLastWord.lastWordLength(input));
    }
    @Test
    public void testThatTheLengthOfAWordIs4(){
        String input = "   fly me to the moon   ";
        assertEquals(4, LengthOfLastWord.lastWordLength(input));
    }
    @Test
    public void testThatTheLengthOfAWordIs6(){
        String input = "luffy is still joyboy";
        assertEquals(6, LengthOfLastWord.lastWordLength(input));
    }  @Test
    public void testThatTheLengthOfAWordIs1(){
        String input = "a";
        assertEquals(1, LengthOfLastWord.lastWordLength(input));
    }
}