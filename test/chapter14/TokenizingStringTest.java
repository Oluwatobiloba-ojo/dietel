package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenizingStringTest {

    @Test
    public void testThatTokenizeAStringAndReturnTheWordWhichIsBeginningWithCapitalLetter(){
        String text = "I am going to The Land Of Peace And Joy";
        String[] wordWithCapital = {"I", "The", "Land", "Of", "Peace", "And", "Joy"};
        assertArrayEquals(wordWithCapital, TokenizingString.filterOnlyWordWithCapitalLetter(text));
    }

    @Test
    public void testThatTokenizingOfAStringReturnNoWordCauseThereIsNoWordBeginningWithCapitalLetter(){
        String text = "hallelujah we are going to our father house";
        assertArrayEquals(new String[]{}, TokenizingString.filterOnlyWordWithCapitalLetter(text));
    }

    @Test
    public void testThatIfTokenizingOfAStringButTheCapitalLetterIsFindNotOnTheFirstLetterDoesNotPickThem(){
        String text = "halleluJah wE Are Going tO Our Father houSe";
        String[] wordWithCapitalLetter = {"Are", "Going", "Our", "Father"};
        assertArrayEquals(wordWithCapitalLetter, TokenizingString.filterOnlyWordWithCapitalLetter(text));
    }


}