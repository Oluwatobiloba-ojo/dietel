package chapter_3;

import java.util.Scanner;

public class switc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        switch (age/10) {
            case 1 -> System.out.println("You are very young .....");
            case 2 -> System.out.println("You are around age 20 - 29");
            case 3 -> System.out.println("You are around age 30 - 39");
            case 4 -> System.out.println("You are around age 40 - 49");
            case 5 -> System.out.println("You are growing up around 50 - 59");
            default -> System.out.println("You are very old and should not be doing this .......");
        }
    }
}
