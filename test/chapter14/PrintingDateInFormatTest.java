package chapter14;

import chapter14.dateFormat.InvalidDateFormatException;
import org.junit.jupiter.api.Test;

import static chapter14.dateFormat.PrintingDateInFormat.formatDate;
import static org.junit.jupiter.api.Assertions.*;

class PrintingDateInFormatTest {

    @Test
    public void testThatWhenOneOfTheFormatOfDateWhichIs04_25_1995WillBeApril_25_1995(){
        String dateFormat = "04/25/1995";
        String secondDateFormat = "April 25, 1995";
        try {
            assertEquals(secondDateFormat, formatDate(dateFormat));
        }catch (InvalidDateFormatException formatException){
            System.out.println(formatException.getMessage());
        }
    }
    @Test
    public void testThatWhenTheFormatOfTheInputIsNotInTheRightFormatThrowsException(){
        String dateFormat = "04_25_1995";
        assertThrows(InvalidDateFormatException.class, ()-> formatDate(dateFormat));
    }
    @Test
    public void testThatWhenTheDayPassTheRangeOfNormalDayThrowsException(){
        String dateFormat = "12/39/1995";
        assertThrows(InvalidDateFormatException.class, ()-> formatDate(dateFormat));
    }@Test
    public void testThatWhenTheMonthPassTheRangeOfNormalMonthRangeThrowsException(){
        String dateFormat = "17/31/1995";
        assertThrows(InvalidDateFormatException.class, ()-> formatDate(dateFormat));
    }@Test
    public void testThatWhenTheNumberFormatOfDateIsGivenItGivesOutTheStringFormat(){
        String dateFormat = "August 30, 2005";
        String secondFormat = "08/30/2005";
        try {
            assertEquals(secondFormat, formatDate(dateFormat));
        }catch (InvalidDateFormatException exception){
            System.out.println(exception.getMessage());
        }
    }
    @Test
    public void testThatTheNumberFormatOfDecember_31_2004Returns12_31_2004(){
        String dateFormat = "December 31, 2004";
        String secondFormat = "12/31/2004";
        try {
            assertEquals(secondFormat, formatDate(dateFormat));
        }catch (InvalidDateFormatException exception){
            System.err.println(exception.getMessage());
        }
    }
    @Test
    public void testThatTheNumberFormatOfDecember_45_2004ThrowsException(){
        String dateFormat = "December 45, 2004";
        assertThrows(InvalidDateFormatException.class, ()-> formatDate(dateFormat));
    }



}