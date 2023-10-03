package chapter_five;

public class Diamond {
    public static void main(String[] args) {
        int number = 19;
        for (int index = 1; index <= number ; index += 2) {
            System.out.println();
            for (int count = index; count <= number; count++) {
                System.out.print("  ");
            }
            for (int rows = 1; rows <= index; rows++) {
                System.out.print("* ");
            }
            for (int row = 1; row < index; row++){
                System.out.print("* ");
            }
        }
        for (int row = 1; row < number; row+= 2) {
            System.out.println();
            for (int index = 1; index <= row + 1; index++) {
                System.out.print("  ");
            }
            for (int count = row + 1; count < number; count++) {
                System.out.print("* ");
            }
            for (int column = row; column < number; column++) {
                System.out.print("* ");
            }
        }
    }
}
