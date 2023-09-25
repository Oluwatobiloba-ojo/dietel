package chapter_4;

import java.util.Scanner;

public class MileAge {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int mile = 0;
    int gallon = 0;
    int total = 0;
    double average = 0;
    int calculate;
    int stopper = 0;
    int count = 0;
    int totalMiles = 0;
    int totalGallon = 0;
    while (stopper != -1) {
        System.out.println("Enter the miles driven ");
        mile = input.nextInt();
        System.out.println("Enter the gallon used for each tankful ");
        gallon = input.nextInt();
        System.out.println("Enter -1 to stop or otherwise do not enter -1 ");
        stopper = input.nextInt();
        totalMiles += mile;
        totalGallon += gallon;
        calculate = mile / gallon;
        System.out.println(calculate);
        total = total + calculate;
        count++;
    }
        average = (double) (totalMiles + totalGallon) / count;
        System.out.printf("The combined miles per gallon is %d", total);
        System.out.printf("%nThe average calculation is %.2f", average);

    }
}
