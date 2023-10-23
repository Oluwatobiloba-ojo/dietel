package chapter_4;

import java.util.Scanner;

public class ExponentialFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double power = 1;
        double divide = 1;
        double factorial = 1;
        System.out.println("Enter the numbers of terms to calculate exponent: ");
        int number = input.nextInt();
        for (int index = 1; index <= number; index++){
            power *= number;
            factorial *= index;
            divide += (power / factorial);
        }
        System.out.println("The Estimated factorial is "+ divide);
    }
}
