package chapter_six.makingDiff.difficult;

import java.security.SecureRandom;
import java.util.Scanner;

public class DifficultyLevel {
    static SecureRandom myRandom = new SecureRandom();
    static Scanner input = new Scanner(System.in);

    public static void response(double percentage){
        if (percentage < 75){
            System.out.println("You will need to go back to your former level");
        }else {
            System.out.println("You can give the next level a chance! ");
        }
    }

    public static double calculatePercentage(int result){
        double rate = (double) (result * 10) / 100;
        return rate * 100;
    }


    public static int result(int level, int result){
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
        return result;
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
