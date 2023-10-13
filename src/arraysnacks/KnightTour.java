package arraysnacks;

import java.security.SecureRandom;
import java.util.Arrays;

public class KnightTour {
    public static void main(String[] args) {
        SecureRandom myRandom = new SecureRandom();
        int[] horizontal = new int[8];
        int[] vertical = new int[8];
        int[][] tour = new int[8][8];
        tour[3][4] = 9;
        horizontal[0] = 2;
        horizontal[1] = 1;
        horizontal[2] = -1;
        horizontal[3] = -2;
        horizontal[4] = -2;
        horizontal[5] = -1;
        horizontal[6] = 1;
        horizontal[7] = 2;

        vertical[0] = -1;
        vertical[1] = -2;
        vertical[2] = -2;
        vertical[3] = -1;
        vertical[4] = 1;
        vertical[5] = 2;
        vertical[6] = 2;
        vertical[7] = 1;
        int random = 0;
        for (int i = 0; i < tour.length; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        int currentRow = 10;
        int currentColumn = 10;
        for (int row = 0; row < tour.length; row++) {
            System.out.print(row);
            for (int column = 0; column < tour[row].length ; column++) {
                if (row == 0){
                    break;
                }
                System.out.print("\t");
                if (row == 3 && column == 4){
                    random = 1 + myRandom.nextInt(6);
                   currentRow =  row + vertical[random];
                   currentColumn = column + horizontal[random];
                    System.out.print(tour[row][column]);
                    break;
                }
                if (row == currentRow && column == currentColumn){
                    tour[row][column] = random;
                }if (row != 3 && column != 4 && row + column == 4 || column - row == 4){
                    System.out.print(column);
                }

            }
            System.out.println();
        }
        System.out.println();
        System.out.println(random);
        for (int index = 0; index < tour.length ; index++) {
            for (int column = 0; column < tour[index].length ; column++) {
                if (tour[index][column] != 0) {
                    System.out.print(tour[index][column] + "\t");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
