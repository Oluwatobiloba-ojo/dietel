package chapter_seven;

import java.security.SecureRandom;

public class GameOfCraps {
    public static SecureRandom myRandom = new SecureRandom();

    public enum Status {CONTINUE, WIN, LOST};
    private static final int SNAKE_EYES = 2;
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int TREE = 3;
    private static final int TWELVE = 12;

    public static void main(String[] args) {
        int [] score = new int[20];
        int [] lose = new int[20];
        int myPoint = 0;
        Status game;
        int pointThatLose = 0;
        int pointThatWin = 0;
        for (int row = 0; row < score.length ; row++) {
            for (int numberOfTimes = 0; numberOfTimes < 100000; numberOfTimes++) {
                int sumOfDice = rollDice();
                switch (sumOfDice) {
                    case ELEVEN:
                    case SEVEN:
                        game = Status.WIN;
                        break;
                    case SNAKE_EYES:
                    case TREE:
                    case TWELVE:
                        game = Status.LOST;
                        break;
                    default:
                        game = Status.CONTINUE;
                        myPoint = sumOfDice;
                }
                while (game == Status.CONTINUE){
                    sumOfDice = rollDice();
                    if (sumOfDice == myPoint){
                        game = Status.WIN;
                    }else if (sumOfDice == SEVEN){
                        game = Status.LOST;
                    }
                }

                if (game == Status.WIN){
                    pointThatWin++;
                }
                if (game == Status.LOST){
                    pointThatLose++;
                }
            }
            score[row] = pointThatWin;
            lose[row] = pointThatLose;
            pointThatWin = 0;
            pointThatLose = 0;
        }
        System.out.printf("\t\t\t%s\t\t\t%s","Win","Lost");
        System.out.println();
        for (int row = 0; row < score.length; row++) {
            System.out.printf("Roll %d\t\t%d\t\t%d", row + 1, score[row], lose[row]);
            System.out.println();
        }

    }

    public static int rollDice() {
        int die1 = 1 + myRandom.nextInt(6);
        int die2 = 1 + myRandom.nextInt(6);
        return die1 + die2;
    }
}
