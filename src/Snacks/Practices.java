package Snacks;

import chapterthree.Account;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Practices {
    public static void main(String[] args) {
        Account account = new Account("Tobi", 2000);
        String name = showInputDialog(null,"Enter Your name");
        account.setName(name);
        String display = """
                1 -> To Withraw
                2 -> To Deposit
                3 -> To checkBalance
                """;
        String input = showInputDialog(null, display);
        switch (input){
            case "1": String amount = showInputDialog("How much did you want to withdraw");{
                int amounts = Integer.parseInt(amount);
                account.withdraw(amounts);
            }
            break;
            case "2": String deposit = showInputDialog("Enter amount to deposit");{
                int deposits = Integer.parseInt(deposit);
                account.deposit(deposits);
            }
            break;
            case "3": String checkers = String.valueOf(account.checkBalance());{
                      showMessageDialog(null, "Your balance is " + checkers);
            }
            break;
            default:
                showInputDialog("Wrong Input");

        }
    }
}
