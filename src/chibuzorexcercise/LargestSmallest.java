package chibuzorexcercise;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number or enter 200 if you want to quit ");
        int number = input.nextInt();
        int minimum;
        minimum = number;
        int maximum;
        maximum = number;
        for (int index = 1; number != 200; index++){
            System.out.println("Enter a  number or enter 200 if you want to quit ");
             number = input.nextInt();
             if(number > maximum && number != 200){
                 maximum = number;
             }
             if(number < minimum && number != 200){
                 minimum = number;
             }
        }
        System.out.printf("Largest number is this %d",maximum);
        System.out.printf("\nSmallest numbest is this %d",minimum);
    }
}
