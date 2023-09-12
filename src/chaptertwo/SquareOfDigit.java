package chaptertwo;

import java.util.Scanner;

public class SquareOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit ");
        int number = input.nextInt();

        int square = number * number;

        System.out.printf("The Square of %d is %d",number,square);
    }
}
