package leet_code;

public class CountOddNumberInInterval {
    public static int[] countOdd(int low, int high) {
        int length = countOddWithinRange(low, high);
        int[] oddNumbers = new int[length];
        int index = 0;
        for (int start = low; start <= high; start++){
            if (start % 2 != 0) {
                oddNumbers[index] = start;
                index++;
            }
        }
        return oddNumbers;
    }
    private static int countOddWithinRange(int low, int high) {
        int counter = 0;
        for (int count = low; count <= high; count++){
            if (count % 2 != 0)counter++;
        }
        return counter;
    }
}
