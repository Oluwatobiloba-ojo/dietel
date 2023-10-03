package chapter_five;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arrays = new int[3];
        System.out.println("Enter a number: ");
        arrays[0] = input.nextInt();
        System.out.println("Enter a number: ");
        arrays[1] = input.nextInt();
        System.out.println("Enter a number: ");
        arrays[2] = input.nextInt();

        for (int index = 1; index <= arrays[0]; index++){
            System.out.print(" * ");
        }
        System.out.println();
        for (int count = 1; count <= arrays[1]; count++){
            System.out.print(" * ");
        }
        System.out.println();
        for (int index = 1; index <= arrays[2]; index++){
            System.out.print(" * ");
        }
    }
}
