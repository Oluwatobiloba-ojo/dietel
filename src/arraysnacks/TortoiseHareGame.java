package arraysnacks;

import java.security.SecureRandom;

public class TortoiseHareGame {
    public static void main(String[] args) {
        String [][] game = new String[7][10];
        SecureRandom myRandom = new SecureRandom();
        System.out.println("Player T is Tortoise:  Player H is Hare");
        int move = myRandom.nextInt(10);
        int tortoiseMove = 0;
        int hareMove = 0;
        //int movement = 0;
        //int numberOfTimes = 0;
        for (int row = 0; row < game.length ; row++) {
            for (int column = 0; column < game[row].length ; column++) {
                int random = myRandom.nextInt(10);
                if (random <= 5){
                    tortoiseMove += 3;
                } else if (random <= 7) {
                    tortoiseMove -= 6;
                } else {
                    tortoiseMove +=1;
                }
                if (random <= 2) hareMove += 0;
                else if (random <= 4) hareMove += 9;
                else if (random == 5) hareMove -= 12;
                else if (random <= 8) hareMove += 1;
                else hareMove -= 2;
                if (column == hareMove) System.out.print("H");
                else System.out.print(" ");
                if (column == tortoiseMove) System.out.print("T");
                else System.out.print(" ");
            }
        }
    }
}
