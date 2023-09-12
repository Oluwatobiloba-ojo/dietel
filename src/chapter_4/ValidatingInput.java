package chapter_4;

import java.util.Scanner;

public class ValidatingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        int gradeCounter = 0;
        while (gradeCounter <= 10){
            System.out.println("Enter 1 = pass, Enter 2 = fail: ");
            int score = scanner.nextInt();

            while (score != 1 && score != 2){
                System.out.println("this is an invalid number, (Enter 1 or 2)");
                score = scanner.nextInt();
            }
            if (score == 1){
                pass++;
            }
            else if (score == 2){
                fail++;
            }
            gradeCounter++;
        }
        System.out.printf("The amount of pass student is %d\n",pass);
        System.out.printf("The amount of student who fail is %d",fail);
    }
}
