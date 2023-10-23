package chapter_3;

public class Loopw {
    public static void main(String[] args) {
        int number = 5;
        for (int row = 1; row <= number; row++) {
            for (int shape = 1; shape <= row; shape++) {
                System.out.print("* ");
            }
            for (int space = 1; space <= number; space++) {
                System.out.print("   ");
            }
            for (int shape2 = row; shape2 <= number; shape2++) {
                System.out.print("# ");
            }
            System.out.println("  ");
        }
    }
}
