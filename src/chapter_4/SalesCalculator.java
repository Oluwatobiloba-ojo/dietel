package chapter_4;

import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to continue this program or enter 0 to stop: ");
        int stopper = input.nextInt();
        for (;stopper != 0; ){

            System.out.println("Enter your name: ");
            String theNAme = input.next();

            System.out.println("Enter the number of item you did in a week: ");
            int item = input.nextInt();

            if (item > 1){
                int total = 0;
                for (int number = 1; number <= item;number++){
                    System.out.println("Enter the value of item: ");
                    int value = input.nextInt();
                    total += value;
                }
                int constant  = 200;
                double percentage = 0.09;
                double result1 =percentage * total;
                double result = constant + result1;
                System.out.println(theNAme + " earning is " + result);
            }
            if (item == 1){
                System.out.println("Enter the value of item: ");
                int value = input.nextInt();
                int constant = 200;
                double percentage = 0.09;
                double answer = percentage * value;
                double result = constant + answer;
                System.out.println(theNAme + " earning is " + result);
            }
            System.out.println("Enter 1 to continue this program or enter 0 to stop:");
            stopper = input.nextInt();
        }
    }
}
