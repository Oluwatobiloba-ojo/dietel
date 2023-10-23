package chibuzorexcercise;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int number = 1;
        int sum = 0;
        while (counter != 10) {
            System.out.println("Enter a number ");
            number = input.nextInt();
            if (number > 0) {
                sum += number;
            }else if (number < 0){
                System.out.println("Enter a natural number: ");
            }
            counter++;
        }
        System.out.println(sum);
    }
}
