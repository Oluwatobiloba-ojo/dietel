package leet_code;

import java.util.Arrays;

public class SubSequence {

    public static boolean isValidSubsequence(int[] subArray, int[] arrayNumbers) {
       int[] subValue = getSubSequenceFromArray(subArray, arrayNumbers);
       return Arrays.equals(subValue, subArray);
    }

    private static int[] getSubSequenceFromArray(int[] subArray, int[] arrayNumbers) {
        int count = 0;
        int[] returnArray = new int[subArray.length];
        for (int number = 0; number < arrayNumbers.length; number++){
            if (arrayNumbers[number] == subArray[count]){
                returnArray[count] = arrayNumbers[number];
                count++;
                if (count == subArray.length) break;
            }
        }
        return returnArray;
    }
}
