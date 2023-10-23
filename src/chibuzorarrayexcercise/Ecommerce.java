package chibuzorarrayexcercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
        final double VAT = 0.175;
        LocalDateTime myDate = LocalDateTime.now();
        DateTimeFormatter dateObj = DateTimeFormatter.ofPattern("dd-MM-yy  HH:mm:ss");
        String myObj = myDate.format(dateObj);
        Scanner input = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> unitPrices = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        System.out.println("What is the customer name: ");
        double subTotal = 0;
        String theName = input.nextLine();
        int numberOfTransaction = 0;
        String rateOfItems = "YES";
        while (rateOfItems.equals("YES")) {
            System.out.println("What did the user buy? ");
            String item = input.next();
            items.add(item);
            System.out.println("How many pieces ?");
            double piece = input.nextInt();
            unitPrices.add(piece);
            System.out.println("How much per unit ?");
            double price = input.nextInt();
            prices.add(price);
            numberOfTransaction++;
            System.out.println("Add more Items ?");
            rateOfItems = input.next();
            rateOfItems = rateOfItems.toUpperCase();
        }
        System.out.println("What is your name: ");
        String cashierName = input.next();
        String surname = input.next();
        System.out.println("How much discount will he get: ");
        int discount = input.nextInt();
        String cashierNames = cashierName + " " + surname;
        System.out.println(cashierNames);
        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312 Hebert Macaulay Way, Sabo Yaba, Lagos.
                TELEPHONE: 012345768954
                DATE: %s
                CASHIER: %s
                CUSTOMERS NAME: %s
                ==========================================
                       ITEM     QTY   PRICE    TOTAL
                ------------------------------------------
                """, myObj, cashierNames, theName);
        for (int counter = 0; counter < numberOfTransaction; counter++) {
            double multiply = unitPrices.get(counter) * prices.get(counter);
            subTotal += multiply;
            System.out.printf("""
                              %s       %.2f         %.2f         %.2f
                            """, items.get(counter), unitPrices.get(counter), prices.get(counter),
                    multiply);
            System.out.println();
        }
        System.out.println("------------------------------------------");
        double discountRate = (discount * subTotal) / 100;
        double addedTax = VAT * subTotal;
        double total = subTotal + discountRate + addedTax;
        System.out.printf("""
                SUBTOTAL: %.2f
                DISCOUNT: %.2f
                VAT @ 17.50: %.2f
                """, subTotal, discountRate, addedTax);
        System.out.printf("""
                =================================================
                            Bill Total: %.2f
                =================================================
                This is not the receipt kindly pay %.2f
                """, total, total);
        System.out.println("How much did the customer give you ?");
        double amount = input.nextDouble();

        while (amount < total) {
            System.out.println("How much did the customer give you ?");
            amount = input.nextDouble();
        }


        double change = amount - total;
        System.out.println();
        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312 Hebert Macaulay Way, Sabo Yaba, Lagos.
                TELEPHONE: 012345768954
                DATE: %s
                CASHIER: %s
                CUSTOMERS NAME: %s
                ==========================================
                       ITEM     QTY   PRICE    TOTAL
                ------------------------------------------
                """, myObj, cashierNames, theName);
        for (int counter = 0; counter < numberOfTransaction; counter++) {
            double multiply = unitPrices.get(counter) * prices.get(counter);
            System.out.printf("""
                              %s       %.2f         %.2f         %.2f
                            """, items.get(counter), unitPrices.get(counter), prices.get(counter),
                    multiply);
            System.out.println();
        }
        System.out.println("------------------------------------------");
        System.out.printf("""
                SUBTOTAL: %.2f
                DISCOUNT: %.2f
                VAT @ 17.50: %.2f
                """, subTotal, discountRate, addedTax);
        System.out.printf("""
                =================================================
                            Bill Total: %.2f
                            Amount Paid: %.2f
                                Balance: %.2f
                =================================================
                        THANKS FOR YOUR PATRONAGE
                =================================================
                """, total, amount, change);

    }
}
