package chapter_3;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int userNumber = input.nextInt();
        System.out.println("Enter a number ");
        int userInput = input.nextInt();

        for(int count = 1; count <= userNumber; count++){
            int total1 = userNumber % count;
            for(int count2 = 1; count2 <= userInput; count2++){
                int total2 = userInput % count2;
                if(count == count2){
                    System.out.println();
                }
            }
        }


    }
}
