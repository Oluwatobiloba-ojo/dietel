package Snacks;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int [] array = new int[10];
        int maximum;
        int minimum;
        String odd = " ";
        for (int number = 0; number < array.length; number++){
            System.out.println("Enter a score: ");
            int score = input.nextInt();
            array[number] = score;
            total += array[number];
            if (array[number] % 2 != 0){
                odd = odd + " " + array[number];
            }
        }
        maximum = array[0];
        for (int numbs = 0; numbs < array.length; numbs++){
            if (array[numbs] > maximum) maximum = array[numbs];
        }
        minimum = array[0];
        for (int numbs = 0; numbs < array.length; numbs++) {
            if (array[numbs] < minimum) minimum = array[numbs];
        }
        int average = total / array.length;
        System.out.println("Total is "+ total);
        System.out.println("Average is " + average);
        System.out.println("The minimum of this score is "+ minimum);
        System.out.println("The maximum of this score is " + maximum);
        System.out.println("The odd number is "+ odd);
    }
}