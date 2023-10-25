package classwork;

import java.util.Scanner;

import static classwork.Strings.checkForAStringIsHavingNumber;
import static classwork.Strings.checkReverse;

public class StringsMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = input.nextLine();
        String validation = checkForAStringIsHavingNumber(number);
        if (validation.equals("Valid")) System.out.println(checkReverse(number));
        else System.out.println(validation);
    }
}
