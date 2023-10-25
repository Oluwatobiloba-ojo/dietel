package Snacks;

import java.util.ArrayList;
import java.util.Arrays;
import static primefactor.PrimeFactor.convertToAnArray;

public class VariableLengthHighestFactor {
    public static int[] highestFactor(int...numbers) {
        int lengthOfHighestNumber = Arrays.stream(numbers).max().getAsInt();
        int count = 0;
        ArrayList<Integer> factors = new ArrayList<>();
        int counter = 0;
        if (getNumbersLessThanZero(numbers) == numbers.length) {
            for (int factor = 2; factor < lengthOfHighestNumber; ) {
                for (int number = 0; number < numbers.length; number++) {
                    if (numbers[number] % factor == 0) {
                        count++;
                        counter++;
                        numbers[number] /= factor;
                    }
                    if (count == numbers.length) {
                        factors.add(factor);
                    }
                }
                if (counter != numbers.length) factor++;
                counter = 0;
                count = 0;
            }
            return convertToAnArray(factors);
        }
        else {
            return new int[]{0};
        }
    }
    public static int getNumbersLessThanZero(int...numbers){
        int countGreaterThanZero = 0;
        for (int count = 0; count < numbers.length; count++){
            if (numbers[count] > 0){
                countGreaterThanZero ++;
            }
        }
        return countGreaterThanZero;
    }

}
