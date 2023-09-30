package array;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] ts = new int[2][3];

        // TO COLLECT ELEMENT IN TO AN ARRAY OF TWO BY THREE
        for (int number = 0; number < ts.length ; number++){
            for (int index = 0; index < ts[number].length; index++){
                System.out.println("Enter a number ");
                int elementOfArray = input.nextInt();
                ts[number][index] = elementOfArray;
            }
        }
        // ASSUMING THAT SMALLEST IS THE ELEMENT IN 0 IN 0
        int smallest = ts[0][0];
        for (int number = 0; number < ts.length ; number++) {
            for (int index = 0; index < ts[number].length; index++) {
                if (ts[number][index] < smallest) smallest = ts[number][index];
            }
        }
        System.out.println(Arrays.deepToString(ts));
        System.out.println("The smallest element in the integer inputted is "+ smallest);

        // DISPLAYING THE TOTAL OF THE THIRD COLUMN
        for (int counter = 0; counter < ts[0].length; counter++){
            System.out.printf("%d  ", ts[0][counter]);
        }
        System.out.println();
        int total = 0;
        total += ts[0][2] + ts[1][2];
        System.out.println("The total of the third column is " + total);

        // DISPLAYING THE ARRAY IN A TABULAR FORMAT
        for(int i = 0; i < ts[0].length; i++){
            System.out.print(ts[0][i] + " ");
        }
        System.out.println();
        for(int j = 0; j < ts[1].length; j++){
            System.out.print(ts[1][j]+ " ");
        }
    }
}
