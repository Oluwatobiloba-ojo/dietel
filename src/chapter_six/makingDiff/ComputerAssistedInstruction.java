package chapter_six.makingDiff;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom myRandom = new SecureRandom();
        String stopper = "CONTINUE";
        while (stopper.equals("CONTINUE")){
            int firstNumber = 1 + myRandom.nextInt(10);
            int secondNumber = 1 + myRandom.nextInt(10);
            int guess = 1 + myRandom.nextInt(3);
            System.out.printf("How much is %d times %d\n", firstNumber, secondNumber);
            int result = input.nextInt();
            int product = firstNumber * secondNumber;
            while (result != product){
                System.out.println("No please Try Again");
                System.out.printf("How much is %d times %d\n", firstNumber, secondNumber);
                result = input.nextInt();
            }
            System.out.println("Very Good");
            System.out.println("Enter stop to end the program and enter continue to move on ");
            stopper = input.next();
        }
    }
}
