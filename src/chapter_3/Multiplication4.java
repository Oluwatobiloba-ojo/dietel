package chapter_3;


public class Multiplication4 {
    public static void main(String[] args) {
        int result = 1;
        for (int number = 1; number <= 12; number++) {
            for (int multiply = 2; multiply <= 3; multiply++) {
                result = multiply * number;
                System.out.printf("%d *  %2d = %3d   ",multiply,number,result);
            }
            System.out.println();
        }
    }
}

