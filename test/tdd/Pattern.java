package tdd;

public class Pattern {
    public static void main(String[] args) {
        int number = 6;
        for(int index = 1; index <= number; index++){
            for (int row = 1; row <= index; row++){
                System.out.print(row);
            }
            for (int space = 1; space <= number; space++){
                System.out.print("  ");
            }
            for (int column = 1; column <= 7 - index; column++){
                System.out.print(column);
            }
            for (int space = 1; space <= number; space++){
                  System.out.print(" ");
            }
                for (int row = index; row >= 1; row--) {
                    System.out.print(row);
            }
            for (int space = 1; space <= number; space++){
                System.out.print(" ");
            }
            for (int column = 1; column <= 7 - index; column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
