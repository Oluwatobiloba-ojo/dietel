package chapter_six;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom myRandom = new SecureRandom();
        String stopper = "YES";
        while (stopper.equals("YES")){
            int random = 1 + myRandom.nextInt(999);
            System.out.println("Guess a number between 1 to 1000");
            int guessNumber = input.nextInt();
            if (random > guessNumber){
                System.out.println("Too low. Try again! ");
            } else if (guessNumber > random) {
                System.out.println("Too high, Try again! ");
            }else {
                System.out.println("Congratulations");
            }
            System.out.println("If you still want to move on press no: ");
            stopper = input.next();
            stopper = stopper.toUpperCase();
            while (!(stopper.equals("NO")) && !(stopper.equals("YES"))){
                System.out.println("Enter the right response: ");
                stopper = input.next();
                stopper = stopper.toUpperCase();
            }
        }

    }
}
