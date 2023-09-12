package chapter_4;

import java.util.Scanner;

public class Required_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number: ");
        int begin = input.nextInt();
        while (sum < begin){
            System.out.println("Enter a number: ");
            int value = input.nextInt();
            sum +=value;
        }
        System.out.printf("""
                        The first userInput is %d
                        The sum of this value collected is %d
                """,begin,sum);
    }
}
