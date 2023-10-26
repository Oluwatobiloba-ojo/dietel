package chapter_seven;

public class Fibonacci {
    public static double fibonnaci(double number){
        double x = 0;
        double y= 1;
        double largest = x;
        double sums = x + y;
        while (x < number){
            if (x > largest) largest = x;
            x = y;
            y = sums;
            sums = y + x;
        }
        return largest;
    }
}
