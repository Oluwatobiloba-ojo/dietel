package arraysnacks;
import java.util.Scanner;

public class KnightTours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  [][] chess = new int[8][8];
        chess [3][4] = 10;
        System.out.print("\t0\t\t1\t\t2\t\t3\t\t4\t\t5\t\t6\t\t7");
        System.out.println();
        System.out.println();
        for (int row = 0; row < chess.length ; row++) {
            System.out.print(row);
            for (int column  = 0; column  < chess[row].length ; column ++) {
                    System.out.print("\t"+chess[row][column]+ "\t");
            }
            System.out.println();
        }
        int count = 1;
        String times = "start";
        while(times.equals("start")){
            System.out.println("Enter the rows and column you want to move by: ");
            String row = input.next();
            String column = input.next();
            for (int rows = 0; rows < chess.length ; rows++) {
                for (int columns = 0; columns < chess[rows].length; columns++) {
                    if (rows == Integer.parseInt(row) && columns == Integer.parseInt(column)){
                        if (chess[rows][columns] == 0) chess[rows][columns] = count;
                    }
                }
            }
            System.out.print("\t0\t\t1\t\t2\t\t3\t\t4\t\t5\t\t6\t\t7");
            System.out.println();
            System.out.println();
            for (int raw = 0; raw < chess.length ; raw++) {
                System.out.print(raw);
                for (int colo  = 0; colo  < chess[raw].length ; colo ++) {
                    System.out.print("\t"+chess[raw][colo]+ "\t");
                }
                System.out.println();
            }
            System.out.println("Enter end to stop and start to continue: ");
            times = input.next();
            count++;
        }

    }
}
