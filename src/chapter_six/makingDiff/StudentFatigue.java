package chapter_six.makingDiff;

import java.security.SecureRandom;
import java.util.Scanner;

public class StudentFatigue {
    public static void main(String[] args){
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
                    display(guess);
                    System.out.printf("How much is %d times %d\n", firstNumber, secondNumber);
                    result = input.nextInt();
                }
                displayGood(guess);
                System.out.println("Enter stop to end the program and enter continue to move on ");
                stopper = input.next();
            }
        }

        private static void displayGood(int guess) {
            switch (guess){
                case 1 -> System.out.println("Very Good ");
                case 2 -> System.out.println("Excellent! ");
                case 3 -> System.out.println("Nice work");
                case 4 -> System.out.println("keep up the good work! ");
            }
        }

        public static void display(int rand){
            switch (rand){
                case 1 -> System.out.println("No please try again: ");
                case 2 -> System.out.println("Wrong Try Once More");
                case 3 -> System.out.println("Dont give up: ");
                case 4 -> System.out.println("No. Keep Trying");
            }
        }
    }
