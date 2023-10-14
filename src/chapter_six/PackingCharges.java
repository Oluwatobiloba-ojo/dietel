package chapter_six;

import java.util.Scanner;

public class PackingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer name: ");
        String name = input.nextLine();
        System.out.println("Enter the hour car packed: ");
        int hour = input.nextInt();
        double charges = calculateCharges(hour);
        System.out.println("Customer " + name + " is paying us $" + charges);
    }
    public static double calculateCharges(int hour){
        double total;
        if (hour == 3){
            total = 2;
        } else if (hour == 24) {
            total = 10;
        }else {
            total = 0.5 * hour;
        }
        return total;
    }
}
