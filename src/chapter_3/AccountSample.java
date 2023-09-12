package chapter_3;

import javax.swing.*;

public class AccountSample {
    public static void main(String[] args) {
        Account1 myAccount = new Account1("Tobi Ojo", 10_000);
        Account1 myAccount2 = new Account1("Ogunbeni thanks", 12000);

        displayAccount(myAccount);
        displayAccount(myAccount2);

        //System.out.print("Enter deposit amount for " + " " + myAccount.getName());
        double amount = Double.parseDouble(input("Enter the amount to deposit from " + " " + myAccount.getName()));
        myAccount.deposit(amount);
        displayAccount(myAccount);

        double amountMy = Double.parseDouble(input("Enter the amount to deposit from " + " " + myAccount2.getName()));
        myAccount2.deposit(amountMy);
        displayAccount2(myAccount2);

        double withdraw = Double.parseDouble(input("Enter the amount to withdraw from " + " " + myAccount.getName()));
        myAccount.withdraw(withdraw);
        displayAccount(myAccount);

        double withdraw2 = Double.parseDouble(input("Enter the amount to withdraw from " + " " + myAccount2.getName()));
        myAccount2.withdraw(withdraw2);
        displayAccount2(myAccount2);
    }
    public static void displayAccount(Account1 myAccount) {
        display(myAccount.getName() + " " + myAccount.getBalance());
    }
    public static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }
    public static void display(String message){
        JOptionPane.showMessageDialog(null,message);
    }
    public static void displayAccount2(Account1 myAccount2) {
        display(myAccount2.getName() + " " + myAccount2.getBalance());
    }
}
