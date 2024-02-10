import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountCharacterTest {

    @Test
    public void testThatIfAStringContainingCharacterReturnTheCharacterAsKeyValueAndCountOfTheCharacterAsValue(){
        String value = "semicolon.africa";
        HashMap<String, Integer> count_of_character = new HashMap<>();
        count_of_character.put("s", 1);
        count_of_character.put("e", 1);
        count_of_character.put("m", 1);
        count_of_character.put("i", 2);
        count_of_character.put("c", 2);
        count_of_character.put("o", 2);
        count_of_character.put("l", 1);
        count_of_character.put("n", 1);
        count_of_character.put(".", 1);
        count_of_character.put("a", 2);
        count_of_character.put("f", 1);
        count_of_character.put("r", 1);
        assertEquals(count_of_character, CountCharacter.countCharacter(value));
    }

    @Test
    public void testThatAStringContainingMosquitoReturnEachCharacterAsKeyAndTheNumberOfTimeInTheStringAsValue(){
        String value = "mosquito";
        HashMap<String, Integer> count_of_characters = new HashMap<>();
        count_of_characters.put("m", 1);
        count_of_characters.put("o", 2);
        count_of_characters.put("s", 1);
        count_of_characters.put("q", 1);
        count_of_characters.put("u", 1);
        count_of_characters.put("i", 1);
        count_of_characters.put("t", 1);
        assertEquals(count_of_characters, CountCharacter.countCharacter(value));
    }

}