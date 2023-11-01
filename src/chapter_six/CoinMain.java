package chapter_six;

import java.util.Scanner;

import static chapter_six.CoinTossing.flipCoin;

public class CoinMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1 -> To toss a coin
                    2 -> End
                    """);
            int value = input.nextInt();
            if (value == 1){
                flipCoin();
            }else if (value == 2) {
                break;
            }else {
                System.out.println("Invalid input put the right thing");
            }
        }
    }
}
