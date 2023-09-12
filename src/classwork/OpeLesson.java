package classwork;

public class OpeLesson {
    public static void main(String[] args) {
        int number = 6;
        for (int index = 1; index <= number; index++){
            for (int firstV = 1; firstV <= index; firstV++){
                System.out.print(firstV );
            }
            for(int secondv = index; secondv <= number; secondv++){
                System.out.print(" ");
            }
            for (int space = 1; space <= number; space++){
                System.out.print(" ");
            }
            for (int firstB = 1; firstB <= 7 - index; firstB++){
                System.out.print(firstB );
            }
            for (int secondB = 1; secondB <= index; secondB++){
                System.out.print("");
            }
            for (int space = 1; space <= number; space++){
                System.out.print(" ");
            }
            for (int secondB = index; secondB >= 1; secondB--){
                System.out.print(secondB);
            }
            for (int shape = 1; shape <= number; shape++){
                System.out.print(" ");
            }
            for (int space = 1; space <= index; space++){
                System.out.print(" ");
            }
            for (int fourthB = 1; fourthB <= 7 - index; fourthB++){
                System.out.print(fourthB );
            }
            System.out.println();
        }

    }
}
