package classwork;

import java.util.Scanner;

public class OpeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, (Enter 0 to stop the program) ");
        int number = input.nextInt();

        int maximum = 0;
        int minimum = number;

        while(number != 0){
            System.out.println("Enter a number, (Enter 0 to stop the program)");
            number = input.nextInt();
            if (number > maximum){
                maximum = number;
            }
            if (number < minimum && number != 0){
                minimum = number;
            }
        }
        System.out.println("The maximum value is " +  maximum);
        System.out.println("The minimum value is " +  minimum);

    }
}
