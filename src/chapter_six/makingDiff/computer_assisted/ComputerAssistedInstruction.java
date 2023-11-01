package chapter_six.makingDiff.computer_assisted;

import java.security.SecureRandom;
import java.util.Scanner;
public class ComputerAssistedInstruction {
    static SecureRandom myRandom = new SecureRandom();
   static Scanner input = new Scanner(System.in);







    public static void computer(){
        int firstNumber = 1 + myRandom.nextInt(10);
        int secondNumber = 1 + myRandom.nextInt(10);
        System.out.printf("How much is %d times %d\n", firstNumber, secondNumber);
        int product = input.nextInt();
        int result = multiplication(firstNumber, secondNumber);
        repeatQuestion(result, firstNumber, secondNumber, product);
    }
    public static void repeatQuestion(int result, int first, int second, int product){
        while (result != product){
            System.out.println("No please Try Again");
            System.out.printf("How much is %d times %d\n", first, second);
            product = input.nextInt();
        }
    }
    public static int multiplication(int first, int second){
        return first * second;
    }
}
