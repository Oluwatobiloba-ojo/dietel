package array;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] myArray = new int[10];
        for (int i = 0; i < 10;) {
            System.out.println("Enter a number between 10 to 100 ");
            int value = input.nextInt();
            if (value != -1){
                myArray[i] = value;
                i++;
            }
        }
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            for (int index = i + 1; index < myArray.length; index++) {
                if (myArray[i] == myArray[index]) {
                    myArray[index] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
