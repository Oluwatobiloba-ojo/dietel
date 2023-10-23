package Snacks;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stopper = "Done";
        while (!stopper.equals("DONE")) {
            System.out.println("Enter the letter: ");
            String letter = input.next();
            String result = numberPhone(letter);
            System.out.println(result);
            System.out.println("""
                    ==================================================
                    ENTER IN CONTINUE TO MOVE ON OR ENTER DONE TO STOP
                    ==================================================
                    """);
            stopper = input.next();
            stopper = stopper.toUpperCase();
        }
    }

    public static String numberPhone(String letter) {
        String alphabet = letter.toLowerCase();
        String result = "";
        if (alphabet.equals("a") || alphabet.equals("b") || alphabet.equals("c")){
            result = "2";
        } else if (alphabet.equals("d") || alphabet.equals("e") || alphabet.equals("f")) {
            result = "3";
        } else if (alphabet.equals("g")|| alphabet.equals("h")|| alphabet.equals("i")) {
            result = "4";
        } else if (alphabet.equals("j")|| alphabet.equals("k")|| alphabet.equals("l")) {
            result = "5";
        } else if (alphabet.equals("m")|| alphabet.equals("n")|| alphabet.equals("o")) {
            result = "6";
        } else if (alphabet.equals("p")|| alphabet.equals("q")|| alphabet.equals("r")|| alphabet.equals("s")) {
            result = "7";
        } else if (alphabet.equals("t")|| alphabet.equals("u")|| alphabet.equals("v")) {
            result = "8";
        } else if (alphabet.equals("w")|| alphabet.equals("x")|| alphabet.equals("y")|| alphabet.equals("z")) {
            result = "9";
        }else {
            result = letter + " is is an invalid input";
        }
        return result;
    }
}
