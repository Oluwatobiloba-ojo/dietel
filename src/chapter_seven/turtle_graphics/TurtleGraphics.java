package chapter_seven.turtle_graphics;

import java.util.Objects;
import java.util.Scanner;

public class TurtleGraphics {
  static Turtle myTurtle = new Turtle();
  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      displayInfo();
      String input = scanner.nextLine();
      while (!input.equals("9")){
        operationCode(input);
        System.out.println("Enter a number");
        input = scanner.nextLine();
      }
    }




  private static void operationCode(String input) {
      switch (input){
        case "1", "3", "2", "4" -> myTurtle.move(Integer.parseInt(input));
        case "5" -> {
          String moveNumber = scanner.nextLine();
          myTurtle.moveBy(Integer.parseInt(moveNumber));
        }
        case "6" -> myTurtle.getBoard();
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
}
