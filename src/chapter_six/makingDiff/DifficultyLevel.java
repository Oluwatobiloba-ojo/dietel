package chapter_six.makingDiff;

import java.security.SecureRandom;
import java.util.Scanner;

public class DifficultyLevel {
    static SecureRandom myRandom = new SecureRandom();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int result = 0;
        System.out.println("Enter 1 -> Difficulty Level 1\n" +
                          "Enter 2 -> Difficult level 2");
        int level = input.nextInt();
        for (int numberOfTimes = 0; numberOfTimes < 10 ; numberOfTimes++) {
            switch (level){
                case 1 -> {
                    int value =  difficulty1();
                    result += value;
                }
                case 2 ->{
                    int value = difficulty2();
                    result += value;
                }
                default -> System.out.println("Invalid Enter the right input. ");
            }
        }
        double rate = (double) (result * 10) / 100;
        double percentage = rate * 100;
        if (percentage < 75){
            System.out.println("You will need to go back to your former level");
        }else {
            System.out.println("You can give the next level a chance! ");
        }

    }
    public static int difficulty1(){
        int random = 1 + myRandom.nextInt(9);
        int secondRandom = 1 + myRandom.nextInt(9);
        int product = secondRandom * random;
        int countOfCorrect = 0;
        System.out.println("How many Times is " + random + " and " + secondRandom);
        int result = input.nextInt();
        if (result == product){
            countOfCorrect++;
        }
        return countOfCorrect;
    }
    public static int difficulty2(){
        int random = 10 + myRandom.nextInt(9);
        int secondRandom = 10 + myRandom.nextInt(9);
        int countOfCorrect = 0;
        int product = secondRandom * random;
        System.out.println("How many Times is " + random + " and " + secondRandom);
        int result = input.nextInt();
        if (result == product){
            countOfCorrect ++;
        }
        return countOfCorrect;
    }
}
