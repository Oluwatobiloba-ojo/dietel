package chapter_seven;

import java.security.SecureRandom;

public class ArcheryClass {
    int numberOfTimes = 0;
    private int playerNumber = 0;
    int[][] archery = new int[4][3];
    static SecureRandom myRandom = new SecureRandom();
    public int getNumberOfPlayers() {
        return archery.length;
    }
    public void setPlayers(int playerNumber) {
        this.playerNumber = playerNumber - 1;
    }
    public int getPlayerSet(){
        return playerNumber + 1;
    }
    public void shotArchery(int moveShot) {
        archery[playerNumber][numberOfTimes] = moveShot;
        if (numberOfTimes == 2){
            numberOfTimes = 0;
        }else numberOfTimes++;
    }
    public int checkOutPlayerScore() {
        return totalOfScore(archery[playerNumber]);
    }
    private int totalOfScore(int[] shots) {
        int total = 0;
        for (int shot: shots) {
            total += shot;
        }
        return total;
    }
    public int checkOutWinner() {
        return checkOutThePlayerWhoWonHighest(archery);
    }
    private int checkOutThePlayerWhoWonHighest(int[][] archery) {
        int [] number = {totalOfScore(archery[0]), totalOfScore(archery[1]), totalOfScore(archery[2]),
                        totalOfScore(archery[3])};
        return maxPosition(number);
    }
    private int maxPosition(int[] number) {
        int maximum = number[0];
        int position = 1;
        for (int count = 1; count < number.length; count++){
            if (number[count] > maximum){
                maximum = number[count];
                position = count + 1;
            }
        }
        return position;
    }
    public void playKnight(){
        for (int count = 0; count < archery.length; count++){
            setPlayers(count + 1);
            System.out.print("Player " + getPlayerSet() + "\t");
            for (int counter = 0; counter < archery[count].length; counter++){
                int move = myRandom.nextInt(10);
                shotArchery(move);
                System.out.print(archery[playerNumber][counter] + "\t");
            }
            System.out.print(totalOfScore(archery[playerNumber]));
            System.out.println();
        }
        System.out.println("The Winner of the contest is Player " + checkOutWinner());
    }
}
