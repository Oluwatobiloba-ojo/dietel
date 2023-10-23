package classwork;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 6");
        int days = input.nextInt();

        while (days > 6){
            System.out.println("Invalid");
            System.out.println("Enter from 0 to 6");
            days = input.nextInt();
        }
        switch (days) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid");
        }
    }
}