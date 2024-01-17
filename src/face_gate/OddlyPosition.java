package selfassesment;

import java.util.Arrays;

public class OddlyPosition {

    public static int[] oddly(int[] numbers) {
        int[] result;
        if (numbers.length % 2 == 0) result = new int[numbers.length / 2];
        else result = new int[(numbers.length / 2) + 1];
        int counter = 0;
        for (int count = 0; count < numbers.length; count++) {
            if (count % 2 == 0) {result[counter] = numbers[count];counter++;}
        }
        return result;
    }
}
