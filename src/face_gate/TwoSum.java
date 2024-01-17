package face_gate;

import java.util.Arrays;

public class TwoSum {

    public static int sumTwoPossibleRangeOfNumber(int[] numbers, int lower, int upper) {
        int result = 0;
        String results = "";
        for (int count = 0; count < numbers.length; count++){
            int number = checkForTwoOf(numbers, lower, upper, results);
            results += number;
            result += number;
        }
        return result;
    }
    private static int checkForTwoOf(int[] numbers, int lower, int upper, String result) {
        for (int count = 0; count < numbers.length; count++){
            Integer number1 = sumUp(count, numbers, lower, upper, result);
            if (number1 != null) return number1;
        }
        return 0;
    }
    private static Integer sumUp(int count, int[] numbers, int lower, int upper, String digit) {
        for (int counter = count +1; counter < numbers.length; counter++) {
            int result = numbers[count] + numbers[counter];
            if (result >= lower && result <= upper && !contain(String.valueOf(result), digit)) return result;
        }
        return null;
    }

    private static boolean contain(String s, String digit) {
        for (int i = 0; i < digit.length(); i++) {
            String result = digit.charAt(i) + "";
            if (result.equals(s))return true;
        }
        return false;
    }
}
