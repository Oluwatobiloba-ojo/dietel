package tdd;

public class Loop2 {
    public static void main(String[] args) {
        int number = 5;

        for(int index = 1; index <= number; index++){
            for (int down = index; down <= number; down++){
                System.out.print("*   ");
            }for(int row = 1; row <= index; row++){
                System.out.print("   *");
            }
            System.out.println();
        }
    }
}
