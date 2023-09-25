package moyinAssesment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial: ");
        int value = input.nextInt();
        int result = 1;
        for (int count = value; count > 1; count--) {
            System.out.print(count+ "*");
            result *= count;
            if (count == 2){
                System.out.print("1");
            }
        }
        System.out.print(" = ");
        System.out.print(result);
    }
}
