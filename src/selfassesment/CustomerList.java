package selfassesment;

import java.util.Scanner;

public class CustomerList {

    public static void main(String[] args) {
        int [][] items = new int[4][3];
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < items.length; row++) {
            for (int column = 0; column < items[row].length ; column++) {
                System.out.printf("Enter the item %d for customer %d: ", column+1, row+1);
                int costOfItem = input.nextInt();
                items[row][column] = costOfItem;
            }
        }
        int total = 0;
        System.out.print("\t\t\tItem1\tItem2\tItem3\tTotal");
        for (int row = 0; row < items.length ; row++) {
            System.out.println();
            System.out.printf("Customer %d", row + 1);
            for (int columns = 0; columns < items[row].length ; columns++) {
                total += items[row][columns];
                System.out.printf("\t%d ",items[row][columns]);
            }
            System.out.print("\t"+ total);
            total = 0;
        }

    }
}
