package chapter_4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a number 2: ");
        int secondNumber = scanner.nextInt();
        
        if (firstNumber == secondNumber){
            System.out.println("0");
        } else if (firstNumber > secondNumber) {
            System.out.println("1");   
        } else if (secondNumber > firstNumber) {
            System.out.println("-1");
        }
    }
}
