package chibuzorarrayexcercise;

import java.util.Scanner;

import static chibuzorarrayexcercise.Finance.*;

public class FinanceMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello kindly enter card details to verify:");
        String cardDetails = input.nextLine();
        String cardType = creditType(cardDetails);
        int lengthOfCardDetails = checkLength(cardDetails);
        String validateCard = validateCardDigit(cardDetails);
        System.out.printf("""
                **************************************
                **Credit Card Type: %s
                **Credit Card Number: %s
                **Credit Card Digit Length: %d
                **Credit Card Validity Status: %s
                **************************************
                
                """, cardType, cardDetails, lengthOfCardDetails, validateCard);
    }
}
