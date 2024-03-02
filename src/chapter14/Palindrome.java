package chapter14;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        return word.equals(reverseWord);
    }
}
