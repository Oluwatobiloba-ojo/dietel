package classwork;

public class SumOfOddPosition {
    public static void main(String[] args) {
        int total = 0;
        int [] newArray = {5, 4, 1, 0, 6, 7, 9};
        for (int i = 1; i < newArray.length ; i+= 2) {
            total += newArray[i];
        }
        System.out.println(total);
    }

    public static int sumEvenPosition(int[] numbers) {
        int sumEven = 0;
        for (int index = 0; index < numbers.length ; index+= 2) {
            sumEven += numbers[index];
        }
        return sumEven;
    }

    public static int sumOddPosition(int[] numbers) {
        int sumOdd = 0;
        for (int index = 1; index < numbers.length ; index+= 2) {
            sumOdd += numbers[index];
        }
        return sumOdd;
    }
}
