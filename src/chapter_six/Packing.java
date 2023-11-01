package chapter_six;

import java.util.Scanner;

import static chapter_six.PackingCharges.calculateCharges;

public class Packing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer name: ");
        String name = input.nextLine();
        System.out.println("Enter the hour car packed: ");
        int hour = input.nextInt();
        double charges = calculateCharges(hour);
        System.out.println("Customer " + name + " is paying us $" + charges);
    }
}
