package arraysnacks;

import java.util.Arrays;

public class Excercise {
    public static void main(String[] args) {
        int [][] numbers = new int[5][6];

        for (int[] number: numbers){
            for (int num = 0; num < number.length; num++){
                number[num] = 0;
            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }
}
