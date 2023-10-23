package tdd;

public class Account {
private int balance;
    public void deposit(int amount) {
        this.balance = balance + amount;
    }

    public int checkBalance() {
        return this.balance;
    }

    public void withdraw(int amount) {
        if (amount < balance) {
            this.balance = balance - amount;
        }else if(amount > balance) {
            System.out.println("insufficient amount");
        }
    }
}
