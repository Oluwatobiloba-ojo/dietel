package selfassesment;

public class triangle {
    public static void main(String[] args) {
        int number = 5;
        for (int column = 1; column <= number; column++){
            System.out.println();
            for (int index = 1; index <= column; index++){
                System.out.print("* ");
            }for (int index = column; index <= number; index++){
                System.out.print("  ");
            }
        }
        for (int row = 1; row <= number; row++){
            System.out.println();
            for (int index = row + 1; index <= number; index++){
                System.out.print("* ");
            }
        }
    }
}
