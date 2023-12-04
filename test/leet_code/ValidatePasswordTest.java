package leet_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatePasswordTest {

    @Test
    public void testThatAPasswordIsInvalidWhenTheLengthOfPasswordIsBelowEight(){
        boolean isValid = ValidatePassword.isValid("mathew");
        assertFalse(isValid);
    }@Test
    public void testThatPasswordIsValidWhenTheLengthOfPasswordIsEightAbove(){
        boolean isValid = ValidatePassword.isValid("oluwatobiloba41");
        assertTrue(isValid);
    }@Test
    public void testThatPasswordOnlyContainLettersAndDigit(){
        boolean isValid = ValidatePassword.isValid("oluwatobiloba!");
        assertFalse(isValid);
    }

}