package chapter_five;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten number: ");
        int number = input.nextInt();
        int minimum;
        minimum  = number;
        int maximum;
        maximum = number;
        for(int count = 1; count < 10; count++){
            System.out.println("Enter ten number");
            number = input.nextInt();
            if (number > maximum){
                maximum = number;
            }if (number < minimum){
                minimum = number;
            }
        }
        int sum = maximum + minimum;
        System.out.println(sum);
    }
}
