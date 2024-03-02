package chapter14;

import java.util.Arrays;

import static chapter14.ManipulatingString.input;

public class TokenizingString {

    public static void main(String[] args) {
        String text = input("Enter your sentence ");
        Arrays.stream(filterOnlyWordWithCapitalLetter(text))
              .forEach(System.out :: println);
    }


    public static String[] filterOnlyWordWithCapitalLetter(String text) {
        String[] sentences = text.split(" ");
        return Arrays.stream(sentences)
                               .filter(TokenizingString::checkIfContainCapitalLetter)
                               .toArray(String[] :: new);
    }

    private static boolean checkIfContainCapitalLetter(String word) {
        String firstLetter = word.charAt(0)+"";
        return firstLetter.equals(firstLetter.toUpperCase());
    }
}
