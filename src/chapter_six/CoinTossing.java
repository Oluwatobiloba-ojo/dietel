package chapter_six;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    static SecureRandom myRandom = new SecureRandom();
    private enum Flip {HEAD, TAIL};
    public static void flipCoin(){
        int tail = 0;
        int head = 0;
        int coinTossing = myRandom.nextInt(2);
        if (coinTossing == 1){
            System.out.println(Flip.TAIL);
            tail++;
            System.out.println("Tail appear " + tail);
        }else {
            System.out.println(Flip.HEAD);
            head++;
            System.out.println("Head now is "+ head);
        }
    }
}
