package Snacks;

public class MultiDimensional {
    public static void main(String[] args) {
        char [][] arrays = new char[3][3];
        arrays[0][0] = 'X';
        arrays[0][1] = 'O';
        arrays[0][2] = 'X';
        arrays[1][0] = 'X';
        arrays[1][1] = 'X';
        arrays[1][2] = 'O';
        arrays[2][0] = 'O';
        arrays[2][1] = 'X';
        arrays[2][2] = 'X';
        printFirstRow(arrays[0].length, arrays[0]);
        printFirstRow(arrays[1].length,arrays[1]);
        printFirstRow(arrays[2].length, arrays[2]);
    }















    public static void printFirstRow(int length,char [] array){
        for (int index = 0; index < length; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }
}