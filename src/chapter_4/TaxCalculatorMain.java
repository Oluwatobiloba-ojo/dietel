package chapter_4;

import java.util.Scanner;

public class TaxCalculatorMain {
    public static void main(String[] args) {
        TaxCalculator myTax = new TaxCalculator();
        Scanner input = new Scanner(System.in);

        for (int number = 1; number <= 3; number++) {
            System.out.println("\nEnter your name: ");
            String theName = input.next();
            myTax.setName(theName);
            System.out.println("Enter your salary for the year: ");
            double amount = input.nextDouble();
            myTax.calculateTax(amount);
            System.out.printf("%nThe name is %s and the tax rate is %.2f",myTax.getName(),myTax.checkTaxRate());
        }
    }
}
