package chibuzorarrayexcercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTest {

    @Test
    public void testForTheLengthOfACreditCardNumber() {
        String atm = "43885760184026";
        int length = Finance.checkLength(atm);
        assertEquals(length, 16);
    }

    @Test
    public void testForTheCreditCardTypeOfAnAtm() {
        String atm = "4388576018402626";
        String type = Finance.creditType(atm);
        String cardType = "Visa cards";
        assertEquals(type, cardType);
    }

    @Test
    public void testForTheLengthOfACreditCards() {
        String atm = "46676543456";
        String response = Finance.creditType(atm);
        String answer = "Invalid input";
        assertEquals(response, answer);
    }

    @Test
    public void testForTheTypeOfACreditCard() {
        String atm = "5388576018402626";
        String response = Finance.creditType(atm);
        String answer = "Master Cards";
        assertEquals(response, answer);
    }

    @Test
    public void testForTheTypeOfACreditCard2() {
        String atm = "37388576018402626";
        String response = Finance.creditType(atm);
        String answer = "American Express Card";
        assertEquals(response, answer);
    }

    @Test
    public void testThatAmericanExpressCardValidateTheirNumberWithTwoDigit() {
        String atm = "3388576018402626";
        String response = Finance.creditType(atm);
        String answer = "Invalid input";
        assertEquals(response, answer);
    }

    @Test
    public void testForTheCardTypeOfACreditCards() {
        String atm = "6388576018402626";
        String response = Finance.creditType(atm);
        String answer = "Discover cards";
        assertEquals(response, answer);
    }

    @Test
    public void testForTheValidityStatusOfACreditCardDigit() {
        String atm = "4388576018402626";
        String response = Finance.validateCardDigit(atm);
        String answer = "Invalid";
        assertEquals(response, answer);
    }

    @Test
    public void testForTheValidityStatusOfACreditCardDigit2() {
        String atm = "5399831619690403";
        String response = Finance.validateCardDigit(atm);
        String answer = "Valid";
        assertEquals(response, answer);
    }
    @Test
    public void testForTheValidityStatusOfACreditCardDigit3() {
        String atm = "5399831619690404";
        String response = Finance.validateCardDigit(atm);
        String answer = "Invalid";
        assertEquals(response, answer);
    }
    @Test
    public void testForTheValidityStatusOfACreditCardDigit4() {
        String atm = "234319283049582";
        String response = Finance.validateCardDigit(atm);
        String answer = "Invalid";
        assertEquals(response, answer);
    }
}
