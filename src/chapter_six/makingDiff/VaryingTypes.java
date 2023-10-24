package chapter_six.makingDiff;

import java.security.SecureRandom;
import java.util.Scanner;

import static chapter_six.makingDiff.DifficultyLevel.difficulty1;
import static chapter_six.makingDiff.DifficultyLevel.difficulty2;

public class VaryingTypes {
    static SecureRandom myRandom = new SecureRandom();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("""
    1 -> Addition
    2 -> Subtraction
    3 -> Multiplication
    4 -> Division
    5 -> Random
    """);
        int results = 0;
        int levels = input.nextInt();
          results = calculate(levels, results);
        System.out.println(results * 10);
    }







    public static int calculate(int levels, int results){
        switch (levels){
            case 1 -> {
                System.out.println("""
                            1. Difficulty Level1
                            2. Difficulty Level2
                            """);
                int innerLevel = input.nextInt();
                switch (innerLevel){
                    case 1 -> results = addition();
                    case 2 -> results = add2();
                }
            }
            case 2 -> {
                int value = subtraction();
                results += value;
            }
            case 3 -> {
                int value = multiplication();
                results += value;
            }
            case 4 ->{
                System.out.println("""
                            1. Difficulty Level1
                            2. Difficulty Level2
                            """);
                int innerLevel = input.nextInt();
                switch (innerLevel) {
                    case 1 ->  results = division();
                    case 2 -> results = divide();
                }
            }
            case 5 -> {
                int random = 1 + myRandom.nextInt(4);
                switch (random){
                    case 1 -> results = multiplication();
                    case 2 -> results = division();
                    case 3 -> results = addition();
                    case 4 -> results = subtraction();
                }
            }
        }
        return results;
    }


    public static int divide(){
        int count = 0;
        double result;
        double divisor;
        for (int i = 0; i < 10 ; i++) {
            int firstNumber = 10 + myRandom.nextInt(
                    9);
            int secondNumber = 10 + myRandom.nextInt(9);
            if (firstNumber > secondNumber){
                divisor = (double) firstNumber /secondNumber;
                System.out.println("What is " + firstNumber + " Divided by " + secondNumber);
            }else {
                divisor = (double) secondNumber / firstNumber;
                System.out.println("What is "+ secondNumber + " Divided by " + firstNumber);
            }
            result = input.nextInt();
            if (result == divisor){
                count++;
            }
        }
        return count;
    }

    private static int division() {
        int count = 0;
        double result;
        double divisor;
        for (int i = 0; i < 10 ; i++) {
            int firstNumber = 1 + myRandom.nextInt(9);
            int secondNumber = 1 + myRandom.nextInt(9);
            if (firstNumber > secondNumber){
                divisor = (double) firstNumber /secondNumber;
                System.out.println("What is " + firstNumber + " Divided by " + secondNumber);
            }else {
                divisor = (double) secondNumber / firstNumber;
                System.out.println("What is "+ secondNumber + " Divided by " + firstNumber);
            }
            result = input.nextInt();
            if (result == divisor){
                count++;
            }
        }
        return count;
    }

    private static int addition() {
        int count = 0;
        for (int numberOfTimes  = 0; numberOfTimes  < 10 ; numberOfTimes ++) {
            int firstNumber = 1 + myRandom.nextInt(9);
            int secondNumber = 1 + myRandom.nextInt(9);
            int add = firstNumber + secondNumber;
            System.out.println("Add " + firstNumber + " with " + secondNumber);
            int addition = input.nextInt();
            if (add == addition){
                count++;
            }
        }
        return count;
    }
    public static int add2(){
        int count = 0;
        for (int numberOfTimes  = 0; numberOfTimes  < 10 ; numberOfTimes ++) {
            int firstNumber = 10 + myRandom.nextInt(9);
            int secondNumber = 10 + myRandom.nextInt(9);
            int add = firstNumber + secondNumber;
            System.out.println("Add " + firstNumber + " with " + secondNumber);
            int addition = input.nextInt();
            if (add == addition){
                count++;
            }
        }
        return count;
    }

    public static int multiplication(){
        int result = 0;
        System.out.println("""
                Enter 1 -> Difficulty1
                Enter 2 -> Difficulty2
                """);
        int level = input.nextInt();
        for (int numberOfTimes = 0; numberOfTimes < 10 ; numberOfTimes++) {
            switch (level) {
                case 1 -> result = difficulty1();
                case 2 -> result = difficulty2();
            }
        }
        return result;
    }
    public static int subtraction(){
        int result = 0;
        System.out.println("""
                Enter 1 -> Difficulty1
                Enter 2 -> Difficulty2
                """);
        int level = input.nextInt();
        for (int numberOfTimes = 0; numberOfTimes < 10 ; numberOfTimes++) {
            switch (level) {
                case 1 -> result = subLevel1();
                case 2 -> result = subLevel2();
                default -> System.out.println("Invalid input ");
            }
        }
        return result;
    }

    private static int subLevel1() {
        int firstNumber = 1 + myRandom.nextInt(9);
        int secondNumber = 1 + myRandom.nextInt(9);
        int result;
        int answer;
        int count = 0;
        if (firstNumber > secondNumber){
            System.out.println("Minus " + firstNumber + " from " + secondNumber);
            answer = input.nextInt();
            result = firstNumber - secondNumber;
        }else {
            System.out.println("Minus " + secondNumber + " from " + firstNumber);
            answer = input.nextInt();
            result = secondNumber - firstNumber;
        }
        if (answer == result){
            count ++;
        }
        return count;
    }
    private static int subLevel2() {
        int firstNumber = 10 + myRandom.nextInt(9);
        int secondNumber = 10 + myRandom.nextInt(9);
        int result;
        int answer;
        int count = 0;
        if (firstNumber > secondNumber){
            System.out.println("Minus " + firstNumber + " from " + secondNumber);
            answer = input.nextInt();
            result = firstNumber - secondNumber;
        }else {
            System.out.println("Minus " + secondNumber + " from " + firstNumber);
            answer = input.nextInt();
            result = secondNumber - firstNumber;
        }
        if (answer == result){
            count ++;
        }
        return count;
    }

}
