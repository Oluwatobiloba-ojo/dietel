package moyin.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [][] bag = new int[5][6];
        System.out.println(Arrays.deepToString(bag));

        for (int []each: bag) {
            System.out.println(Arrays.toString(each));
        }

        int count = 1;
        for (int i = 0; i < bag.length; i++) {
            for (int j = 0; j < bag[i].length; j++) {
                bag[i][j] = count++;
            }
            System.out.println(Arrays.toString(bag[i]));
        }



    }
}
