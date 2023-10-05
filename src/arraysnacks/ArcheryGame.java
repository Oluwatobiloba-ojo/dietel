package arraysnacks;

import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ArcheryGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalFirstScore = 0;
        int totalSecondScore = 0;
        int totalThirdScore = 0;
        int totalFourthScore = 0;
        System.out.println("""
                ============================
                    WELCOME TO DELIGHTED
                        ARCHERY GAME
                ============================
                """);
        int [][] games = new int[4][3];
        for (int count = 0; count < 3; count++){
            System.out.println();
            for (int i = 0; i < games.length ; i++) {
                SecureRandom myRandom = new SecureRandom();
                int scoreNumber = myRandom.nextInt(10);
                games[i][count] = scoreNumber;
                if (i == 0){
                    totalFirstScore += games[i][count];
                } else if (i == 1) {
                    totalSecondScore += games[i][count];
                } else if (i == 2) {
                    totalThirdScore += games[i][count];
                } else if (i == 3) {
                    totalFourthScore += games[i][count];
                }
                if (i == 3) {
                    System.out.printf("%d%5s\n", count + 1, "Game");
                    System.out.print(games[0][count] + " ");
                    System.out.print(games[1][count] + " ");
                    System.out.print(games[2][count] + " ");
                    System.out.print(games[3][count] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("PlayerOne Score is " + totalFirstScore);
        System.out.println("PlayerTwo Score is " + totalSecondScore);
        System.out.println("PlayerThree Score is "+ totalThirdScore);
        System.out.println("PlayerFourth Score is " + totalFourthScore);
         int result = Math.max(Math.max(Math.max(totalFirstScore, totalSecondScore),totalThirdScore), totalFourthScore);
        System.out.println("The winner of the game is "+ result + " score ownership");
    }
}
