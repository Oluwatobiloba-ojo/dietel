package chapter_3;

import static java.lang.Math.pow;

public class Power2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        for (int number = 1; number <= 5; number++){
            for (int value = 2; value <= number; value++){
                int result =(int) Math.pow(a,b);
                System.out.println(a +"\t" + b + "\t" + result);
            }
        }
    }
}

