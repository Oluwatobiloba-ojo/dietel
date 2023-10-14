package chapter_six.makingDiff;

import java.security.SecureRandom;
import java.util.Scanner;

public class MonitoringStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom myRandom = new SecureRandom();
        int numberOfPasses = 0;
        for (int question = 0; question < 10 ; question++) {
            int random = 1 + myRandom.nextInt(9);
            int secondRandom = 1 + myRandom.nextInt(9);
            int product = random * secondRandom;
            System.out.printf("How much is %d times %d", random, secondRandom);
            int result = input.nextInt();
            if (result == product){
                numberOfPasses++;
            }
        }
        double rate = (double) (numberOfPasses * 10) / 100;
        double percentage = rate * 100;
        if (percentage < 75){
            System.out.println("Please ask your teacher for extra help ");
        }else {
            System.out.println("Congratulation you are ready for the next level! ");
        }
    }
}
