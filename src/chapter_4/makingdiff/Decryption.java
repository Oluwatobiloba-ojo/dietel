package chapter_4.makingdiff;
import java.util.Scanner;
public class Decryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int replicateThird;
        int replicateFour;
        int constant = 7;
        int firstValue;
        int secondValue;
        int thirdValue;
        int fourthValue;
        System.out.println("Enter an encrypted value and convert ");
        int encrypted = input.nextInt();
        while (encrypted > 9999) {
            System.out.println("Enter an encrypted value and convert ");
            encrypted = input.nextInt();
        }

        // SEPARATION OF THE ENCRYPTED TO SEPARATE DIGIT
        int firstDigit = encrypted / 1000;
        int secondDigit = encrypted / 100 % 10;
        int thirdDigit = encrypted / 10 % 10;
        int fourDigit = encrypted % 10;

        // VARIABLE SWAP OF THE ENCRYPTED CODE
        replicateThird = thirdDigit;
        thirdDigit = firstDigit;
        firstDigit = replicateThird;
        replicateFour = fourDigit;
        fourDigit = secondDigit;
        secondDigit = replicateFour;

        // PERFORMING DECRYPTION
        if (constant - firstDigit > 0){
            firstValue = firstDigit + 10;
        }else {
        firstValue = firstDigit;
        }

        if (constant - secondDigit > 0){
            secondValue = secondDigit + 10;
        }else {
            secondValue = secondDigit;
        }

        if (constant - thirdDigit > 0){
            thirdValue = thirdDigit + 10;
        }else {
            thirdValue = thirdDigit;
        }

        if (constant - fourDigit > 0){
            fourthValue = fourDigit + 10;
        }else {
            fourthValue = fourDigit;
        }
        // SECOND STEP
        firstValue -= 7;
        secondValue -= 7;
        thirdValue -= 7;
        fourthValue -= 7;

        System.out.printf("%d%d%d%d",firstValue,secondValue,thirdValue,fourthValue);


    }
}
