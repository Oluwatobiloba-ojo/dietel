package chaptertwo;

import java.util.Scanner;

public class Opelesson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = input.nextInt();

        int prime = 0;
        int index = 1;
        while(index <= number){
            if (number % index == 0)prime++;
            index++;
        }
        System.out.println(prime);
        if(prime > 2) System.out.println("Its not a prime number");
        if(prime == 2) System.out.println("Its a prime number ");
    }
}
