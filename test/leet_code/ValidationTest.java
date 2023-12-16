package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidationTest {

    @Test
    public void testThatWeValidateAPasswordReturnFalseHavingLengthOfLessThanEight(){
        String password = "ope";
        assertFalse(Validation.validate(password));
    }
    @Test
    public void testThatWhenWeValidateAPasswordReturnFalseIfThereIsNoDigitButEight(){
        String password = "rashidats";
        assertFalse(Validation.validate(password));
    }
    @Test
    public void testThatWeValidateAPasswordReturnFalseWhenItHavingDigit_LengthOfEightAndNoSpecialChars(){
        String password = "rashidats12";
        assertFalse(Validation.validate(password));
    }


}