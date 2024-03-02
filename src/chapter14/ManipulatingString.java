package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipulatingString {
    static Scanner scanner = new Scanner(System.in);

    public static boolean isContainSpecialCharacter(String word) {
       for(int count = 0; count < word.length(); count++){
           if (word.charAt(count) >= 32 && word.charAt(count) <= 47) return true;
           else if(word.charAt(count) >= 58 && word.charAt(count) <= 64) return true;
           else if (word.charAt(count) >= 91 && word.charAt(count) <= 96) return true;
           else if (word.charAt(count) >=123 && word.charAt(count) <= 126) return true;
       }
       return false;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        String word = "";
        while (!word.equals("#")){
            word = input("Enter a word of string or press # to cancel");
            words.add(word);
        }
        printTheSpecialAndNormalOnALine(words);

    }

    private static void printTheSpecialAndNormalOnALine(List<String> words) {
        int numberWithoutSpecialChars = 0;
        int numberWithSpecialChars = 0;
        StringBuffer wordWithoutSpecialChars = new StringBuffer();
        StringBuffer wordWithSpecialChars = new StringBuffer();
        for (int count = 0; count < words.size(); count++){
            String word ;
            if (count == 0) word = words.get(count).toUpperCase();
            else word = words.get(count);
            if (isContainSpecialCharacter(word)) {numberWithSpecialChars++;wordWithSpecialChars.append(word);}
            else{numberWithoutSpecialChars++;wordWithoutSpecialChars.append(word);}
        }
        System.out.println(wordWithoutSpecialChars);
        System.out.println(wordWithSpecialChars);
        System.out.println("Number of string inputted which does not contain special characters is "+ numberWithoutSpecialChars);
        System.out.println("Number of string inputted which contain special characters is "+ numberWithSpecialChars);
    }

    public static String input(String output) {
        System.out.println(output);
        return scanner.nextLine();
    }
}
