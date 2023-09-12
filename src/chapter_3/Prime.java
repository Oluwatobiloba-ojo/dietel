package chapter_3;

import java.util.Scanner;

public class Prime {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();
        int prime = 0;
        int index;
        for(index = 2; index < number; index++){
            if(number % index == 0){
                prime++;
            }
        }
        if (prime > 0){
            System.out.println("It is not a prime number");
        }else if( prime == 0 ){
            System.out.println("It a prime number");
        }

    }

}
