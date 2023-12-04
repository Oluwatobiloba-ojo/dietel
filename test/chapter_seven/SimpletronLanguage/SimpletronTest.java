package chapter_seven.SimpletronLanguage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpletronTest {

    @Test
    public void testThatSimpletronLanguageCanReadAValueAndAlsoWriteIt(){
        Simpletron simpletron = new Simpletron();
        simpletron.setValue("50");
        simpletron.read(9);
        assertEquals("+0050", simpletron.write(9));
    }

    @Test
    public void testThatWordInSimpletronOnlyContainFourDigitNumbers(){
        Simpletron simpletron = new Simpletron();
        simpletron.setValue("99999");
        simpletron.setValue("70");
        simpletron.read(7);
        assertEquals("+0070", simpletron.write(7));
    }

    @Test
    public void testThatWeCanReadAValuesAndAddValuesToEachOther(){
        Simpletron simpletron = new Simpletron();
        simpletron.setValue("10");
        simpletron.read(9);
        simpletron.setValue("20");
        simpletron.read(8);
        simpletron.load(9);
        simpletron.add(8);
        simpletron.store(10);
        assertEquals("+0030", simpletron.write(10));
    }

    @Test
    public void testThatSimpletronCanSubtractNumberInACollection(){
        Simpletron simpletron = new Simpletron();
        simpletron.setValue("100");
        simpletron.read(9);
        simpletron.load(9);
        simpletron.setValue("150");
        simpletron.read(11);
        simpletron.subtraction(11);
        simpletron.store(12);
        assertEquals("-0050", simpletron.write(12));
    }

}