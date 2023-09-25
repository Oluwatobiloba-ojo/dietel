package chapter_4;

import java.util.Scanner;

public class UserTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of triangle you desire");
        int length = input.nextInt();
        displayTriangle(length);
    }
    public static int displayTriangle(int lengthOfTriangle){
            int row;
        for (row = 0; row < lengthOfTriangle; row++){
            for (int column = 1; column <= row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
        return row;
    }
}
