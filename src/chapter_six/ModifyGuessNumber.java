package chapter_six;

import java.security.SecureRandom;
import java.util.Scanner;

public class ModifyGuessNumber {

    public static void main(String[] args) {
        SecureRandom myRandom = new SecureRandom();
        Scanner input = new Scanner(System.in);
        String stopper = "YES";
        int count = 0;
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
            count++;
            System.out.println("If you still want to move on press no: ");
            stopper = input.next();
            stopper = stopper.toUpperCase();
            while (!(stopper.equals("NO")) && !(stopper.equals("YES"))){
                System.out.println("Enter the right response: ");
                stopper = input.next();
                stopper = stopper.toUpperCase();
            }
        }
        if(count <= 10){
            System.out.println("Either you know the secret");
        } else {
            System.out.println("You should be able to do better! ");
        }
    }
}
