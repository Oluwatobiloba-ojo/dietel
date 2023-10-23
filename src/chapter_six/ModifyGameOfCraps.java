package chapter_six;

import java.security.SecureRandom;
import java.util.Scanner;

public class ModifyGameOfCraps {
    public static SecureRandom myRandom = new SecureRandom();

    public enum Status {CONTINUE, WIN, LOST};
    private static final int SNAKE_EYES = 2;
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int TREE = 3;
    private static final int TWELVE = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int point = 0;
        Status game;
        double bankBalance = 1000;
        System.out.println("Enter a wager: ");
        double userInput = input.nextDouble();
        while (userInput > bankBalance){
            System.out.println("Reenter the wager it is invalid: ");
            userInput = input.nextDouble();
        }
        String stopper = "START";
        while (stopper.equals("START")) {
            int sumOfDice = rollDices();
            switch (sumOfDice) {
                case SEVEN:
                case ELEVEN:
                    game = Status.WIN;
                    break;
                case SNAKE_EYES:
                case TREE:
                case TWELVE:
                    game = Status.LOST;
                    break;
                default:
                    game = Status.CONTINUE;
                    point = sumOfDice;
                    System.out.println("Your point is now " + point);
            }

            while (game == Status.CONTINUE) {
                sumOfDice = rollDices();
                if (sumOfDice == point) {
                    game = Status.WIN;
                } else if (sumOfDice == SEVEN) {
                    game = Status.LOST;
                }
            }
            if (game == Status.WIN) {
                bankBalance += userInput;
                System.out.println("Your balance now is " + bankBalance);
                displayGoodNews();
            } else {
                bankBalance -= userInput;
                System.out.println("Your balance now is " + bankBalance);
                displayBadNews();
            }
            System.out.println("Enter start to continue: ");
            stopper = input.next();
            stopper = stopper.toUpperCase();
        }
        if (bankBalance == 0){
            displayBadNews();
        }else {
            System.out.println("You won " + bankBalance);
            displayGoodNews();
        }
    }

    private static void displayBadNews() {
        int rand = 1 + myRandom.nextInt(3);
        switch (rand) {
            case 1 -> System.out.println("Aha you are going for brokenness");
            case 2 -> System.out.println("You can never make it!!! ");
            case 3 -> System.out.println("You are going to drink garri for a very long time");
        }
    }

    private static void displayGoodNews() {
        int rand = 1 + myRandom.nextInt(3);
        switch (rand) {
            case 1 -> System.out.println("You are cashing out big");
            case 2 -> System.out.println("You are making it!!! ");
            case 3 -> System.out.println("You are up big now is the time to cash out");
        }
    }

    public static int rollDices(){
        int first = 1 + myRandom.nextInt(6);
        int second = 1 + myRandom.nextInt(6);
        System.out.println("Player rolled " + first + " + " + second + " = " + (first+second));
        return first + second;
    }

}
