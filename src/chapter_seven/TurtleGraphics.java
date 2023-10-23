package chapter_seven;

import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] turtle = new int[20][20];
        System.out.println("""
                ======================================
                    WELCOME TO TURTLE GRAPHICS
                1. PRESS ONE TO PEN UP
                2. PRESS TWO TO PEN DOWN
                3. PRESS THREE TO TURN RIGHT
                4. PRESS FOUR TO TURN LEFT
                4. PRESS FIVE OR TEN TO MOVE IN SPACES
                5. PRESS SIX TO DISPLAY
                6. PRESS NINE TO END
                ======================================
                """);
        String value = input.nextLine();
        int row = 0;
        int column = 0;
        while (!value.equals("9")) {
            if (value.equals("2")) {
                turtle[row][column] = 1;
            } else if (value.equals("3")) {
                column++;
                turtle[row][column] = 1;
            } else if (value.equals("4")) {
                column--;
                turtle[row][column] = 1;
            } else if (value.equals("5")) {
                column+= 5;
                turtle[row][column] = 1;
            } else if (value.equals("6")) {
                for (int i = 0; i < turtle.length; i++) {
                    for (int j = 0; j < turtle[i].length; j++) {
                        if (turtle[i][j] == 1) {
                            System.out.print("*" + "\t");
                        } else
                            System.out.print("\t");
                    }
                    System.out.println();
                }
            }
            if (column >= 20){
                column = 0;
            }
            row++;
            value = input.nextLine();
        }
    }
}
