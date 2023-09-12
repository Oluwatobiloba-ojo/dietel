package chibuzorexcercise;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int container = number;
        int index = 1;
        while (index < number){
            container *= index;
            index++;
        }
        System.out.println(container);
    }
}
