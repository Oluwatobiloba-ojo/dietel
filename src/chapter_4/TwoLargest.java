package chapter_4;

import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int largest = 0;
        int largest2 = 0;
        for (int index = 1; index <= 3; index++){
            System.out.println("Enter a number ");
            number = input.nextInt();
            if (number > largest){
                largest = number;
//                if (){
//                    largest2 = number;
//                }
            }
        }
        System.out.println(largest);
        System.out.println(largest2);
    }
}
