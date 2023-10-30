package chapter_seven.turtle_graphics;

import java.util.Scanner;

public class TurtleGraphics {
  static Turtle myTurtle = new Turtle();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        displayInfo();
        String value = "0";
        boolean condition = true;
        while (!value.equals("9")){
            do {
                try {
                    value = input.nextLine();
                    turtleGame(value);
                    condition = false;
                }catch (IllegalArgumentException exception){
                    System.out.println(exception.getMessage());
                }
            }while (condition);
        }
    }


















    public static void displayInfo(){
        System.out.println("""
                ======================================
                    WELCOME TO TURTLE GRAPHICS
                1. PRESS ONE TO PEN UP
                2. PRESS TWO TO PEN DOWN
                3. PRESS THREE TO TURN RIGHT
                4. PRESS FOUR TO TURN LEFT
                5. PRESS FIVE OR TEN TO MOVE IN SPACES
                6. PRESS SIX TO DISPLAY
                6. PRESS NINE TO END
                ======================================
                """);
    }
    public static void turtleGame(String value){
        switch (value){
            case "1" -> myTurtle.penUp();
            case "2" -> myTurtle.penDown();
            case "3" -> myTurtle.moveRight();
            case "4" -> myTurtle.moveLeft();
            case "5" -> myTurtle.moveSpaces();
            case "6" -> myTurtle.displayShapesMoveWhenPenIsDown();
        }
    }
}
