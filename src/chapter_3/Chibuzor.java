package chapter_3;

import java.util.Scanner;

public class Chibuzor {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int index = 1; index <= 5; index++){
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println(sum);
       int  count = 0;
       while(count < 5){
           System.out.println("Enter the number: ");
           int number = scanner.nextInt();
           sum = sum + number;
           count = count + 1;
       }
        System.out.println(sum);
    }
}
