package chapter_3;

import java.util.Scanner;

public class Chibuzorclass {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
            int index;
        for(index = 1; index <= number; index++)
            if(number % index == 0){
                counter++;
            }
        System.out.println(counter);
        if (counter > 2) System.out.println("Its is not a prime number");
        if (counter == 2) System.out.println("It is a prime number");
    }
}
