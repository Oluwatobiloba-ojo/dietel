package chapter_3;

public class Account {
    
    private int balance;

    public int deposit(int amount){
        this.balance = balance + amount;
        return balance;
    }
    public void withdraw(int amount){
        if (amount < balance) {
            this.balance = balance - amount;
        }else {
            System.out.println("insufficient amount");
        }
    }
    public int checkBalance() {
        return this.balance;
    }
}
