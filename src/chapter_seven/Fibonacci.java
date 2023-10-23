package chapter_seven;

public class Fibonacci {
    public static void main(String[] args) {
        fibo(30.5);
    }
    public static void fibo(int number){
        int x = 0;
        int y = 1;
        int sums = x + y;
        int largest = x;
        while (x < number){
            System.out.print(x + " ");
            if (x > largest) largest = x;
            x = y;
            y = sums;
            sums = x + y;
        }
        System.out.println("The largest value is " + largest);
    }
    public static void fibo(double number){
        double x = 0;
        double y= 1;
        double largest = x;
        double sums = x + y;
        while (x < number){
            System.out.print(x + " ");
            if (x > largest) largest = x;
            x = y;
            y = sums;
            sums = y + x;
        }
        System.out.println("The largest number is "+ largest);
    }
}
