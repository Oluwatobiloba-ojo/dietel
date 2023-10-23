package chapter_seven;

import java.security.SecureRandom;

public class ArcheryGame {
    public static void main(String[] args) {
        int totalScore = 0;
        int maximumScore = 0;
        int player = 0;
        System.out.println("""
                ============================
                    WELCOME TO DELIGHTED
                        ARCHERY GAME
                ============================
                """);
        int [][] games = new int[4][3];
        for (int count = 0; count < games.length; count++){
            System.out.printf("Player %d\t\t", count + 1);
            for (int i = 0; i < games[i].length ; i++) {
                SecureRandom myRandom = new SecureRandom();
                int scoreNumber = myRandom.nextInt(10);
                games[count][i] = scoreNumber;
                if (count == 0){
                    totalScore += games[count][i];
                    System.out.print(games[count][i]+ " \t ");
                } else if (count == 1) {
                    totalScore += games[count][i];
                    System.out.print(games[count][i]+ " \t ");
                } else if (count == 2) {
                    totalScore += games[count][i];
                    System.out.print(games[count][i]+ " \t ");
                } else {
                    totalScore += games[count][i];
                    System.out.print(games[count][i]+ " \t ");
                }
            }
            System.out.println();
//            System.out.printf("Total  %d\t\t", totalScore);
            System.out.println();
            if (totalScore > maximumScore){
                maximumScore = totalScore;
                player++;
            }
            totalScore -= totalScore;
        }
        System.out.println("The winner of the game is player "+ player + " score ownership");
    }
}
