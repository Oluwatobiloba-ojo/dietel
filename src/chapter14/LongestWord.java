package chapter14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static chapter14.ManipulatingString.input;

public class LongestWord {

    public static void main(String[] args) {
        String sentence = input("Enter your sentence with space denoting different word");
        System.out.println("Your longest word in the sentence is " + maximumCharacterIn(sentence));
    }

    public static String maximumCharacterIn(String sentence) {
        String[] words = sentence.split(" ");
        return findLargest(words);
    }

    private static String findLargest(String[] words) {
        String largestWord = "";
        for (String word : words) {
            if (word.length() > largestWord.length()){
                largestWord = word;
            }
        }
        return largestWord;
    }

}
