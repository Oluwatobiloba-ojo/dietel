package leet_code;

import java.util.ArrayList;

public class PalindromicSubsequence {

    public static int countPalindromicSubsequence(String input) {
        ArrayList<String>subSequence;
        subSequence = checkOutForSubsequence(input);
        return countPalindrome(subSequence);
    }

    private static int countPalindrome(ArrayList<String> subSequence) {
        int counter = 0;
        for (int count = 0 ; count < subSequence.size(); count++){
            if (palindrome(subSequence.get(count))) counter++;
        }
        return counter;
    }

    private static boolean palindrome(String value){
        String result = "";
        for (int count = value.length()-1; count >= 0; count--){
            result += value.charAt(count) + "";
        }
        if (result.equals(value)) return true;
        return false;
    }

    private static ArrayList<String> checkOutForSubsequence(String input) {
        ArrayList<String>result = new ArrayList<>();
        for (int count = 0; count < input.length(); count++){
            int value = count + 1;
            int nextIndex = value+1;
            while (value < input.length() - 1){
                String sub = input.charAt(count)+"" + input.charAt(value)+ input.charAt(nextIndex);
                nextIndex++;
                if (nextIndex == input.length()){
                    value++;
                    nextIndex = value+1;}
                if (!result.contains(sub)) result.add(sub);
            }
        }
        return result;
    }
}
