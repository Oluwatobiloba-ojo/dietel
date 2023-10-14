package chapter_six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeautifyingStringsTest {

    @Test
    public void testForBeautifyingStrings(){
        String name = "Admissions";
        String result = BeautifyingStrings.addFullStop(name);
        String answer = "Admissions.";
        assertEquals(result, answer);
    }
    @Test
    public void testForBeautifyingStrings2(){
        String word = "Gangs";
        String result = BeautifyingStrings.addFullStop(word);
        String answer = "Gangs.";
        assertEquals(answer, result);
    }

    @Test
    public void testForBeautifyingString3(){
        String word = "gangs";
        String result = BeautifyingStrings.capitalize(word);
        String answer = "Gangs";
        assertEquals(result, answer);
    }
    @Test
    public void testForBeautifyingStrings5(){
        String name = "admissions";
        String result = BeautifyingStrings.capitalize(name);
        String answer = "Admissions";
        assertEquals(result, answer);
    }
    @Test
    public void testForBeautifyingStrings6(){
        String name = "Admissions";
        String result = BeautifyingStrings.capitalize(name);
        String answer = "Admissions";
        assertEquals(result, answer);
    }
    @Test
    public void testForBeautifulStrings(){
        String name = "Admissions";
        String result = BeautifyingStrings.beautify(name);
        String answer = "Admissions.";
        assertEquals(result, answer);
    }
    @Test
    public void testForBeautifulStrings2(){
        String name = "Ope";
        String result = BeautifyingStrings.beautify(name);
        String answer = "Ope.";
        assertEquals(result, answer);
    }

}
