package chapter14;

import static chapter14.ManipulatingString.input;

public class SearchingString {

    public static void main(String[] args) {
        String word = input("Enter your sentence");
        String search = input("Enter your search word");
        System.out.println(numberOfOccurrence(word, search));
    }

    public static int numberOfOccurrence(String word, String character) {
        return word.indexOf(character);
    }
}
