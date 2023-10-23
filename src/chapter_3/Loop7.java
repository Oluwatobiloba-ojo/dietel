package chapter_3;

import java.util.Scanner;

public class Loop7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number  = input .nextInt();
        System.out.println("Enter a number: ");
        int number2 = input.nextInt();

        for(int count = 1; count <= number; count++){
            if(number % count == 0){
                System.out.println(count);
              //  System.out.print(count + " Are the factor of" + " " +number);
                System.out.println();
            }
        }
        for(int count = 1; count <= number2; count++){
            if(number2 % count == 0){
                System.out.println();
                System.out.println(count);
                //System.out.print("\t" + count + " Are the factor of" + " " + number2);
            }
        }

    }
}
