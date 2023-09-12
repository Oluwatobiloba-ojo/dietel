package chibuzorexcercise;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        System.out.println("Enter a number or 1000 to quit program: ");
        int value = input.nextInt();
        while (value != 1000){
            System.out.println("Enter a number or 1000 to quit:");
            value = input.nextInt();
            if (value > 0){
                positive ++;
            } else if (value < 0) {
                negative ++;
            }else {
                zeros ++;
            }
        }
        System.out.printf("Positive value are %d",positive);
        System.out.printf("\nNegative value are %d",negative);
        System.out.printf("\nZeros input are %d",zeros);
    }
}
