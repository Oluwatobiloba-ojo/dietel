package leet_code;

import java.util.Arrays;

public class ArrayElementNotEqualToNeighbour {


    public static int[] notEquals(int[] input) {
        Arrays.sort(input);
        for (int i = 1; i < input.length-1; i++){
            if (input[i] == (input[i - 1] + input[i + 1]) / 2) {
                int temp = input[input.length - 1];
                int second = input[i+1+1];
                input[input.length - 1] = input[i+1];
                input[i+1] = second;
                input[i+1+1] = temp;
            }
        }
        return input;
    }
}
