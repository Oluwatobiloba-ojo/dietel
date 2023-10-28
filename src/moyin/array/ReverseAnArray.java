package moyin.array;

import java.util.Arrays;

public class ReverseAnArray {

    public static int[][] reverse(int[][] arrays) {
        int[][] reverseArray = new int[arrays.length][arrays[0].length];
        for (int i = 0; i < arrays[0].length; i++) {
            int count = 0;
            for (int j = arrays.length - 1; j >= 0; j--){
                reverseArray[i][count] = arrays[j][i];
                count++;
            }
        }
        return reverseArray;
    }

}
