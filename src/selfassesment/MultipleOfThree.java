package selfassesment;

import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println(number + " is a multiple of 3 ");
        }
        else{
            System.out.println(number+" is not multiple of 3");
        }
    }

}
