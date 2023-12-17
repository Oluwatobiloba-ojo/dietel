package leet_code;

public class PlusOne {

    public static int[] plus(int[] numbers) {
        int number = getArrayToNumber(numbers) + 1;
        return numberToArray(number);
    }

    private static int[] numberToArray(int number) {
        int numb = String.valueOf(number).length();
        int [] result = new int[numb];
        while (number != 0){
            result[--numb] = number % 10;
            number /= 10;
        }
        return result;
    }

    private static int getArrayToNumber(int[] numbers) {
        String result = "";
        for (int number: numbers) {
            result += number;
        }
        return Integer.parseInt(result);
    }
}
