package moyin.array.memoryGame;

import java.util.Arrays;
import java.util.Scanner;

public class MemoryGame {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a difficulty level. Choose between 2 and 10");
        int difficultyLevel = scanner.nextInt();

        Card card = new Card(difficultyLevel);

        System.out.println(Arrays.toString(card.getDeck()));
        System.out.print("Starting");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            sleep();
        }

        for (int i = 0; i < 4; i++) {
            skip();
            card.shuffle();
            System.out.println(Arrays.toString(card.getDeck()));

            for (int j = 0; j < 3; j++){
                if (j == 1) System.out.println(card.nextMotivationalStatement());
                sleep();
            }
        }

        skip();

        for (int i = 1; i <= difficultyLevel; i++) {
            System.out.printf("%3s", i);
        }
        System.out.println();
        System.out.println(" "+Arrays.toString(card.getBlankDeck()));
        System.out.println("Where is "+card.getDeck()[card.getNextWinningSymbolIndex()]);
        int playerWinningCardIndex = scanner.nextInt();

        skip();
        System.out.println(Arrays.toString(card.getDeck()));
        if (card.playerHasWon(playerWinningCardIndex)){
            System.out.println("Congratulations! You won!");
        }
        else {
            System.out.println("Dey shine your eyes next time");
        }
    }

    private static void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

    private static void skip(){
        System.out.println("""
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                """);
    }
}
