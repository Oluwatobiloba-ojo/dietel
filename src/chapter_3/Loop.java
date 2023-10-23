package chapter_3;

public class Loop {
    public static void main(String[] args) {
        int number = 5;
        for (int index = 1; index <= number; index++) {
            for (int rows = index; rows <= number; rows++) {
                System.out.print("* ");
            }
            for (int space = 1; space <= number; space++) {
                System.out.print("   ");
            }
            for (int second = 1; second <= index; second++) {
                System.out.print("# ");
            }
            for (int space2 = 2; space2 <= number; space2++) {
                System.out.print("  ");
            }
            for (int third = index; third <= number; third++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}

