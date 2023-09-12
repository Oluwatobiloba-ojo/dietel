package chapter_3;

public class Account1 {
    private String name;
    private double balance;


    public Account1 (String name, double balance){
     this.name = name;
     this.balance = balance;
    }


    public void setName(String name){
        this.name = name;
    }
    public void deposit (double amount){
        this.balance = balance + amount;
    }
    public void withdraw(double amount){
        if(amount < balance){
            balance -= amount;
        }else if (amount > balance) {
            this.balance = balance;
            System.out.println("insufficient funds");
        }
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    //public void displayAccountName(String name, double balance){
     //   this.name = name;
       // this.balance = balance;
    //}
    //public double displayAccountBalance(double amount){
       // this.balance = amount;
        //return balance;
    }


//}
