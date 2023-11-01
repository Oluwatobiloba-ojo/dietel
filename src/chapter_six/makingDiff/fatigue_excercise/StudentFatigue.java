package chapter_six.makingDiff.fatigue_excercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class StudentFatigue {
   static Scanner input = new Scanner(System.in);
   static SecureRandom myRandom = new SecureRandom();
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
    public static void computer(){
        int firstNumber = 1 + myRandom.nextInt(10);
        int secondNumber = 1 + myRandom.nextInt(10);
        int guess = 1 + myRandom.nextInt(3);
        System.out.printf("How much is %d times %d\n", firstNumber, secondNumber);
        int product = input.nextInt();
        int result = multiplication(firstNumber, secondNumber);
        repeatQuestion(result, firstNumber, secondNumber, product);
        displayGood(guess);
    }
    public static void repeatQuestion(int result, int first, int second, int product){
        while (result != product){
            int guess = 1 + myRandom.nextInt(3);
            display(guess);
            System.out.printf("How much is %d times %d\n", first, second);
            product = input.nextInt();
        }
    }
    public static int multiplication(int first, int second){
        return first * second;
    }
    }
