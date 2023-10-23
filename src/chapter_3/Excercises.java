package chapter_3;

import java.util.Scanner;

public class Excercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a number: ");
        //int result = scanner.nextInt();
        //for(int index = 1; index <= 100; index++){
          //  result = index * index;
         //   System.out.println(result);
        // }
        int index = 20;
        int count = 1;
        while(count <= 20) {
            System.out.println("Enter a number: ");
            int result = scanner.nextInt();
            count = result * result;
            System.out.println(count);
            count++;
        }
    }
}
