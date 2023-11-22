package chapter_seven.knight_game;

import java.util.InputMismatchException;
import java.util.Scanner;

import static chapter_seven.knight_game.KnightsMain.myKnights;


public class KnightExceptionalHandling {
    static boolean condition = true;
    static Scanner input = new Scanner(System.in);
    public static void exceptions(){
        condition = true;
        while (condition) {
            try {
                System.out.println("Enter the position between (1 to 8)");
                int moveNumber = input.nextInt();
//                myKnights.moveKnightsMethod(moveNumber - 1);
                myKnights.setPosition(moveNumber);
                myKnights.insert();
                myKnights.displayTheKnightChess();
                condition = false;
            }catch (IllegalArgumentException argumentException){
                System.out.println(argumentException.getMessage());
            }
            catch (InputMismatchException exception){
                System.out.println(exception.getMessage());
                input.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException boundsException){
                System.out.println(boundsException.getMessage());
                System.out.println();
            }
        }
    }
}
