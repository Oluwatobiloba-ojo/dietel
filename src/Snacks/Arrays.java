package Snacks;

import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        for (int number = 0; number < array.length; number++){
            System.out.println("Enter a number: ");
            int score = input.nextInt();
            array[number] = score;
        }
        System.out.println(java.util.Arrays.toString(array));
        int largest = 0;
        for (int numbers = 0; numbers < array.length ; numbers ++) {
            if (array[numbers] > largest){
                largest = array[numbers];
            }
        }
        System.out.println(largest);
    }
}
