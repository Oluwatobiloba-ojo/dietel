package leet_code;

public class LengthOfLastWord {
    public static int lastWordLength(String input) {
       int index = getIndexOfLastAlphabetInLastWord(input);
       return getLengthOfLastWord(index, input);
    }
    private static int getLengthOfLastWord(int index, String input) {
        int counter = 0;
        for (int count = index; count >= 0; count--){
            String value = input.charAt(count) + "";
            if (!value.matches("[A-Za-z]"))break;
            counter++;
        }
        return counter;
    }

    private static int getIndexOfLastAlphabetInLastWord(String input) {
        for (int count = input.length() -1; count >= 0; count--){
            String value = input.charAt(count) + "";
            if (value.matches("[A-Za-z]"))return count;
        }
        return 0;
    }
}
