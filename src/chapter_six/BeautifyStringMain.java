package chapter_six;

import java.util.Scanner;

import static chapter_six.BeautifyingStrings.beautify;

public class BeautifyStringMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        System.out.println(beautify(word));
    }
}
