package chapter_seven;

import java.security.SecureRandom;

public class DiceRolling {
    public static void main(String[] args) {
        int [] cards = new int[60];
        for (int number = 0; number <cards.length ; number++) {
            cards[number] = 1 + number;
        }
        displayingCard(cards);
        displayingResultFromDice(cards);
    }






    private static void displayingResultFromDice(int[] cards) {
        for (int i = 0; i < cards.length ; i++) {
            System.out.print(cards[i] + "\t");
            for (int j = 0; j < cards.length ; j++) {
                dice();
            }
            System.out.println();
        }
    }

    private static void displayingCard(int[] cards) {
        for (int i = 0; i < cards.length ; i++) {
            System.out.print("\t"+ cards[i]);
        }
        System.out.println(" ");
    }

    public static void dice(){
        SecureRandom myRandom = new SecureRandom();
        SecureRandom myRandoms = new SecureRandom();
        int firstDice = 1 + myRandom.nextInt(6);
        int secondDice = 1 + myRandoms.nextInt(6);
        int sum = firstDice + secondDice;
        System.out.print(sum + "\t");
    }
}
