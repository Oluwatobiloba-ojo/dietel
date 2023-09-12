package chapter_4;


public class CheckBoard {
    public static void main(String[] args) {
        int number = 8;
        for (int row = 1; row <= 4; row++) {
            for (int asteriks = 1; asteriks <= number; asteriks++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.print(" ");
            for (int space = 1; space <= 8; space++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}