package ceasar_cipher;

import function.Ceasar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTest {

    @Test
    public void testForTheFunctionThatGivesACipherOfAPlainLetterWithAKey(){
        int keys = 3;
        String [] cipher = {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"
                            ,"O","P", "Q", "R", "S", "T", "U", "V", "W"};
        String [] result = Ceasar.cipherGenerator(keys);
        assertArrayEquals(cipher, result);
    }
    @Test
    public void testForTheFunctionThatGivesACipherOfPlainLettersWithKey(){
        int key = 5;
        String [] cipher = {"V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H" ,"I", "J", "K", "L",
                            "M", "N", "O", "P", "Q", "R", "S", "T", "U"};
        String [] result = Ceasar.cipherGenerator(key);
        assertArrayEquals(cipher, result);
    }
    @Test
    public void testForTheEncryptFormOfACharacter(){
        int key = 3;
        String character = "B";
        String encryptCharacter = Ceasar.encrypt(character, key);
        assertEquals(encryptCharacter, "Y");
    }
    @Test
    public void testForTheEncryptFormOfACharacter2(){
        int key = 3;
        String character = "HELLO";
        String result = "EBIIL";
        String encryptCharacter = Ceasar.encrypt(character, key);
        assertEquals(result, encryptCharacter);
    }
    @Test
    public void testForTheEncryptFormOfACharacter3(){
        int key = 3;
        String character = "hello";
        String result = "EBIIL";
        String encryptCharacter = Ceasar.encrypt(character, key);
        assertEquals(result, encryptCharacter);
    }
    @Test
    public void testForTheDecryptionOfAnEncryptedValue(){
        int key = 3;
        String character = "X";
        String decryptCharacter = Ceasar.decrypt(character, key);
        assertEquals(decryptCharacter, "A");
    }
    @Test
    public void testForTheDecryptValueOfAnEncryptValue(){
        int key = 3;
        String character = "EBIIL";
        String decryptCharacter = Ceasar.decrypt(character, key);
        assertEquals(decryptCharacter, "HELLO");
    }
    @Test
    public void testForTheDecryptValueOfAnEncryptValue2(){
        int key = 3;
        String character = "ebiil";
        String decryptCharacter = Ceasar.decrypt(character, key);
        assertEquals(decryptCharacter, "HELLO");
    }


}
