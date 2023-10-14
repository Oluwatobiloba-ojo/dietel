package chapter_six;

import java.util.ArrayList;

public class Greatest {

    public static int commonDivisor(int firstNumber, int secondNumber) {
       int []numbers =  factors(firstNumber);
       int [] num = factors(secondNumber);
       int [] common = commonFactors(numbers, num);
       int maximum = common[0];
        for (int nums = 0; nums < common.length ; nums++) {
            int number = common[nums];
            if (number > maximum){
                maximum = number;
            }
        }
       return maximum;
    }

    private static int[] commonFactors(int [] number, int [] integer){
        ArrayList <Integer> factor = new ArrayList<>();
        for (int first = 0; first < number.length; first++) {
            for (int second = 0; second < integer.length; second++) {
                int nums = number[first];
                int numbers = integer[second];
                if (nums == numbers){
                    factor.add(nums);
                }
            }
        }
        return convertToArray(factor);
    }
    private static int[] factors(int firstNumber) {
        ArrayList <Integer> result = new ArrayList<>();
        for (int factor = 1; factor <= firstNumber ; factor++) {
            if (firstNumber % factor == 0){
                result.add(factor);
            }
        }
        return convertToArray(result);
    }

    private static int [] convertToArray(ArrayList result) {
        int [] numbers = new int[result.size()];
        for (int number = 0; number < numbers.length ; number++) {
            numbers[number] = (int) result.get(number);
        }
        return numbers;
    }
}
