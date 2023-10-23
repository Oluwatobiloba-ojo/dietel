package chapter_4.makingdiff;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        int replicaFirst;
        int replicaSecond;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a four digit which you want us to encrypt: ");
        String var = scanner.nextLine();

        // looping value of the value not equal to four digit
        while (var.length() < 4 || var.length() > 5 || var.matches(" %s ")) {
            System.out.println("Enter a four digit number to be encrypt: ");
            var = scanner.nextLine();
        }

        int value = Integer.parseInt(var);
        // SEPARATING THE DIGIT OF VALUE
        int firstDigit = value / 1000;
        int secondDigit = value / 100 % 10;
        int thirdDigit = value / 10 % 10;
        int fourDigit = value % 10;

        // PERFORMING ENCRYPTION
        // ADDING SEVEN TO THE DIGIT
        firstDigit += 7;
        secondDigit += 7;
        thirdDigit += 7;
        fourDigit += 7;
        firstDigit %= 10;
        secondDigit %= 10;
        thirdDigit %= 10;
        fourDigit %= 10;

        // SWAP THE NUMBERS
        // FIRST DIGIT TO THIRD DIGIT AND SECOND DIGIT TO THIRD DIGIT
        replicaFirst = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = replicaFirst;
        replicaSecond = secondDigit;
        secondDigit = fourDigit;
        fourDigit = replicaSecond;

        // CASTING TO STRINGS
        String first = String.valueOf(firstDigit);
        String second = String.valueOf(secondDigit);
        String third = String.valueOf(thirdDigit);
        String four = String.valueOf(fourDigit);
        //ADDING STRINGS TOGETHER
        String encrypt = first + second + third + four;
        System.out.println("The encrypted value of  " + var + " is " + encrypt);

    }
}
