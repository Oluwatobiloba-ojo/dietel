package chapter_five;

public class Triangle {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++){
            for (int index = 1; index <= count; index++){
                System.out.print("*");
            }
            for (int space = count; space <= 10; space++){
                System.out.print(" ");
            }
            for (int index = 10; index >= count; index--){
                System.out.print("*");
            }
            for (int space = 1; space <= count + 1; space++ ){
                System.out.print(" ");
            }
            for (int space = 1; space <= count; space++){
                System.out.print(" ");
            }
            for (int index = count; index <= 10; index++){
                System.out.print("*");
            }
            for (int space = 10; space >= count; space--){
                System.out.print(" ");
            }
            for (int index = 1; index <= count; index++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
