package chaptertwo;

import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        int lotteryDigit = 321;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lottery digit: ");
        int lotteryNumber = scanner.nextInt();

        int lotteryL = lotteryNumber / 100;
        int lotteryF = lotteryNumber % 10;

        if (lotteryNumber == lotteryDigit) {
            System.out.println("You won $10,000 congratulation");
        } else if (lotteryNumber == lotteryL && lotteryNumber == lotteryF) {
            System.out.println("You just won $5000 congratulation");
        }else if(lotteryNumber == lotteryL) {
            System.out.println("You just won $1000 congratulation ");
        }else {
            System.out.println("You have lost try again next time ");
        }
    }
}
