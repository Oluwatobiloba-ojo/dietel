package selfassesment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int value = 1;
        while (number > 1){
            value *= number;
            number--;
        }
        System.out.println(value);
    }
}
