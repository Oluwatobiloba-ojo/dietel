package chapter_4;

import java.util.Scanner;

public class UserTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length base of the triangle you wanted :");
        int lengthBase = input.nextInt();

        for (int row = 1; row <= lengthBase; row++){
            for (int column = 1; column <= row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
