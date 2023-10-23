package chapter_4;

import java.util.Scanner;

public class Stress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int largest2 = 0;
        for (int number = 1; number <= 10; number++){
            System.out.println("Enter a number: ");
            int value = scanner.nextInt();
            if (value > largest){
                largest2 = largest;
                largest = value;
            }else if (largest2 < value){
                largest2 = value;
            }
        }
        System.out.println("The overall largest number is "+ largest);
        System.out.println("The Second largest number is "+ largest2);
    }
}