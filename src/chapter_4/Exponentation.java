package chapter_4;

import java.util.Scanner;

public class Exponentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        double product = 1;
        double sum = 1;
        for (int index = 1; index <= number; index++){
            sum = sum * (1.0 / index);
            product += sum;
        }
        System.out.println(product);
    }
}
