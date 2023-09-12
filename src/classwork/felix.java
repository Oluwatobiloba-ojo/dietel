package classwork;

import java.util.Scanner;

public class felix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maximum = 0;
        int minimum;

        System.out.println("Enter a number:");
        int value = input.nextInt();

        minimum = value;

        for (int number = 1; number <= 2; number++) {
            System.out.println("Enter a number: ");
            value = input.nextInt();

            if(value > maximum ){
                maximum = value;
            }
            if(value < minimum){
                minimum = value;
            }
        }

        System.out.println("The highest value is "+ maximum);
        System.out.println("The lowest value is " + minimum);
    }
}