package chapter14;

public class ComparingPortionOfString {


    public static boolean regionComparison(String firstWord, String secondWord, int start, int length) {
        return firstWord.regionMatches(start, secondWord, start, length);
    }
}
