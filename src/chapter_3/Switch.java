package chapter_3;
import java.util.Scanner;

public class Switch {
    static Scanner input = new Scanner(System.in);
    private static double balance;
    public static void main(String[] args) {
        request();
        String request = input.nextLine();
        while(!request.equals ("5")) {
            switch (request) {
                case "1" -> transfer();
                case "2" -> withdraw();
                case "3" -> deposit();
                case "4" -> checkBalance();
            }
            request();
            request = input.nextLine();
        }
    }

    public static void  request(){
        System.out.println("Put you card in");
        display("""
                1-> Transfer
                2-> Withdraw
                3-> Deposit
                4-> Check balance
                5 -> Exit
                                    """);
        System.out.println("Enter your request: ");
    }

    private static void deposit() {
        display("""
                ============================
                #1,000               #15,000
                #2,000               #20,000
                #5,000               #30,000
                #1,0000              others
                ============================
                """);
        display("Enter the amount ");
        int amount = input.nextInt();
        balance += amount;
        display("Successful Transaction");
    }

    public static void checkBalance() {
        display("Enter your pin ");
        int pin = input.nextInt();
    }

    public static void display(String text){
        System.out.println(text);
    }
    public static void transfer(){
        display("""
                ==========================
                Ensure your cover your pin
                to ensure someone does not\s
                see it
                ============================
                                             """);
        display("Enter pin of your account: ");
        String pin = input.nextLine();
        display("Enter the account to transfer: ");
        String account = input.nextLine();
        display("""
                ========================
                1 -> UBA
                2-> GTBANK
                3-> UNION
                ========================
                """);
        String bank = input.nextLine();
        display("Enter the amount to send ");
        int amount = input.nextInt();
        balance -= amount;
        display("Transfer already done ......");
    }
    public static void withdraw(){
        display("""
                =============================
                1-> #1000              4 -> #3000
                2-> #5000              5 -> #15000
                3-> 10000              6 -> #20000
                =============================
                """);
        double value = input.nextDouble();
        balance = balance - value;
        display(String.valueOf(balance));
        display("Transaction done ");
    }
}
