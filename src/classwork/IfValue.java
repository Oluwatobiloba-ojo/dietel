package classwork;

import java.util.Scanner;

public class IfValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        if (number >= 1 && number < 30){
            System.out.println("Low level");
        }else if (number >= 30 && number < 50){
            System.out.println("Average");
        }else if (number >= 50 && number < 80){
            System.out.println("High");
        }else if (number >= 80 && number <= 100){
            System.out.println("A score");
        }else System.out.println("Invalid number");
    }
}
