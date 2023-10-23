package chapter_six;

import java.util.Scanner;

public class BeautifyingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        System.out.println(beautify(word));
    }
    public static String addFullStop(String name) {
        String result = "";
        String lastIndex = String.valueOf(name.charAt(name.length() - 1));
        if (!(lastIndex.equals("."))){
            result = name + ".";
        }else {
            result = lastIndex;
        }
        return result;
    }

    public static String capitalize(String word) {
        String firstIndex = String.valueOf(word.charAt(0));
        String words = word.substring(1);
        firstIndex = firstIndex.toUpperCase();
        return firstIndex + words;
    }

    public static String beautify(String name) {
        String first = addFullStop(name);
        return capitalize(first);
    }
}
