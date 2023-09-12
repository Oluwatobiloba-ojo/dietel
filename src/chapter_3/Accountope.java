package chapter_3;

import java.util.Scanner;

public class Accountope {
    static Scanner input = new Scanner(System.in);
    private static double balance;

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        display("""
                ==============
                1-> Transfer
                2-> Withdraw
                3-> Deposit
                4-> Balance
                ===============
                """);
        display("Enter the mode of your account: ");
        String mode = input.nextLine();

        switch (mode) {
            case "1" -> transfer();
            case "2" -> withdraw();
            case "3" -> deposit();
            case "4" -> checkBalance();
            default -> mode = null;
        }
    }

    public static void display(String prompt) {
        System.out.println(prompt);
    }

    public static void deposit() {
        display("""
                ============================
                #1000             #1200
                #3000             #15000
                #5000             #20000
                #10000            others
                                      """);
        Scanner scanner = new Scanner(System.in);
        display("Enter the amount to deposit:");
        double input = scanner.nextDouble();
        balance += input;
        display("Deposit Successfully");
    }

    public static void withdraw() {

        display("""
                #1000                 #20000
                #2000                 #30000
                #3000                 Others""");
        display("Enter the amount to withdraw:");
        double amount = input.nextDouble();
        balance -= amount;
        display(String.valueOf(balance));
        display("Withdrawal successfully");
    }

    public static void transfer() {
        display("Enter the account number for the transfer: ");
        String account = input.nextLine();

        display("""
                =======================
                1-> UBA
                2-> GTBANK
                3-> UNION BANK
                4-> FIRST BANK\s
                5-> ACCESS BANK
                6-> FIDELITY
                ==========================
                                          """);
        display("Enter the bank name:");
        String bankName = input.nextLine();
        switch (bankName) {
            case "1": {
                display("Enter the amount: ");
                int amount = input.nextInt();
                display("""
                        TRANSFER DONE TO   ******    \s
                                             """
                        + account);
            }
            case "2": {
                display("Enter the amount: ");
                int amount = input.nextInt();
                display("""
                        TRANSFER DONE TO   ******    \s
                                             """
                        + account);
            }
            case "3": {
                display("Enter the amount: ");
                int amount = input.nextInt();
                display("""
                        TRANSFER DONE TO   ******    \s
                                             """
                        + account);
            }
            case "4": {
                display("Enter the amount: ");
                int amount = input.nextInt();
                display("""
                        TRANSFER DONE TO   ******    \s
                                             """
                        + account);
            }
            case "5": {
                display("Enter the amount: ");
                int amount = input.nextInt();
                display("""
                        TRANSFER DONE TO   ******    \s
                                             """
                        + account);
            }
            case "6": {
                display("Enter the amount: ");
                int amount = input.nextInt();
                display("""
                        TRANSFER DONE TO   ******    \s
                                             """
                        + account);
            }
        }
    }

    public static void checkBalance() {
        display("Enter pin: ");
        String pin = input.nextLine();
        getBalance();
    }

    public static double getBalance() {
        return balance;
    }
}
