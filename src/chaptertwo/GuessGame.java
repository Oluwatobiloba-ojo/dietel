package chaptertwo;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the guess game\nHead(0),Tail(1)\n");
        int result = random.nextInt(2);
        System.out.println("Enter a number betwwen 0 and 1");
        int answer = scanner.nextInt();
        if(answer == result) {
            System.out.println("Congratulation you won");
        }else if (answer != result) {
            System.out.println("Olodo you failed,your are wrong");
        }
    }
}
