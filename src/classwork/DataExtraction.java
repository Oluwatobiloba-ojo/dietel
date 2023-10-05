package classwork;

import java.util.Arrays;
import java.util.Scanner;

public class DataExtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of your data: ");
        int row = input.nextInt();
        System.out.println("Enter the column of your data ");
        int column = input.nextInt();
        int [][] dataSet = new int[row][column];
        for (int i = 0; i < dataSet.length ; i++) {
            for (int j = 0; j < dataSet[i].length ; j++) {
                System.out.println("Enter the element of the data: ");
                int data = input.nextInt();
                dataSet[i][j] = data;
            }
        }
        System.out.println(Arrays.deepToString(dataSet));
        System.out.println("Enter the row you want to see for ");
        int rows = input.nextInt();
        System.out.println("Enter the start position of you data ");
        int startPosition = input.nextInt();
        System.out.println("Enter the end position of your data ");
        int endPosition = input.nextInt();
        int [] extractedData =  extract(dataSet, rows, startPosition, endPosition);
        System.out.println(Arrays.toString(extractedData));
    }


    public static int [] extract(int[][] data, int row, int startPosition, int endPosition) {
        int [] rowData = data[row - 1];
        int length = (endPosition - startPosition) + 1;
        int [] extract = new int[length];
        int count = 0;
        for (int i = startPosition - 1; i < endPosition; i ++){
            extract[count] = rowData[i];
            count++;
        }
        return extract;
    }

    public int[] extractByColumn(int[][] data, int column, int startPosition, int endPosition) {
        int length = (endPosition - startPosition) + 1;
        int [] extracted = new int[length];
        int count = 0;
        for (int i = startPosition - 1; i < endPosition ; i++) {
            extracted[count] = data[i][column - 1];
            count++;
        }
        return extracted;
    }
}
