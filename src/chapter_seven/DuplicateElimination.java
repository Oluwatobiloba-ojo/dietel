package chapter_seven;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[10];
        for (int i = 0; i < 10; ) {
            System.out.println("Enter a number between 10 to 100 ");
            int value = input.nextInt();
            if (value != -1) {
                myArray[i] = value;
                i++;
            }
        }
        System.out.println(Arrays.toString(myArray));
        int [] remove =  duplicate(myArray);
        System.out.println(Arrays.toString(remove));
    }







    public static int [] duplicate(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int index = i + 1; index < numbers.length; index++) {
                if (numbers[i] == numbers[index]) {
                    numbers[index] = 0;
                }
            }
        }
           int length = calculateLength(numbers);
           int [] integers;
        integers = arrangementNumber(numbers, length);
        return integers;
    }

    private static int[] arrangementNumber(int[] numbers, int length) {
        int [] arranged = new int[length];
        int count = 0;
        for (int number : numbers) {
            if (number != 0) {
                arranged[count] = number;
                count++;
            }
        }
        return arranged;
    }

    private static int calculateLength(int[] numbers) {
        int length = 0;
        for (int i : numbers) {
            if (i != 0) {
                length++;
            }
        }
        return length;
    }
}
