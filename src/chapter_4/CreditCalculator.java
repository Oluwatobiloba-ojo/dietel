package chapter_4;

import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press 1 to stop the application or press 0 to continue: ");
        int stopper = input.nextInt();

        while (stopper != 1){
            System.out.println("Enter the account number: ");
            int account = input.nextInt();
            System.out.println("Enter balance at the beginning of the month: ");
            int beginBalance = input.nextInt();
            System.out.println("Total of all items charged by the customers in a month: ");
            int item = input.nextInt();
            System.out.println("Total of all credit applied to the customers account in a month: ");
            int credit = input.nextInt();
            System.out.println("Allowed credit limit");
            int creditLimit = input.nextInt();

            int newBalance = beginBalance + item - credit;

            if (newBalance > creditLimit){
                System.out.println();
                System.out.println(account);
                System.out.println(newBalance);
                System.out.println("Credit limit exceeded");
            }
            if (newBalance <= creditLimit){
                System.out.println();
                System.out.println(account);
                System.out.println(newBalance);
                System.out.println("Credit limit not exceeded");
            }
            System.out.println("Press 1 to stop the application or press 0 to continue: ");
            stopper = input.nextInt();
        }
    }
}
