package leet_code;

public class TransposeMatrix {

    public static int[][] transpose(int[][] numbers) {
        int [][] newResult = new int[numbers[0].length][numbers.length];
        for (int count = 0; count < numbers[0].length; count++) {
            transpose(numbers, newResult, count);
        }
        return newResult;
    }

    private static void transpose(int[][] numbers, int[][] newResult, int count) {
        for (int counter = 0; counter < numbers.length; counter++) {
            newResult[count][counter] = numbers[counter][count];
        }
    }
}
