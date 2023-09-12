package chapter_3;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = scanner.nextInt();
//
//        if (score == 90) System.out.println("A");
//        if (score == 70) System.out.println("B");
//        if (score == 50) System.out.println("C");
//        if (score == 40) System.out.println("D");
//        if (score <= 40) System.out.println("F");
//
//
//        if (score == 90) {
//            System.out.println("A");
//        }

//        if (score >=90) {
//            System.out.println("A");
//        } else if (score>= 70 && score <= 79) {
//            System.out.println("B");
//        }

        switch (score/10) {
            case 9-> greet();
            case 8 -> System.out.println("B");
            case 7 -> System.out.println("C");
        }
    }
    public static void greet() {
        System.out.println("you did well");
    }
}
