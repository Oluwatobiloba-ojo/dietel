package array;

import java.util.*;

public class Example_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;

        int[] array = {1, 2, 3, 4, 5, 60, 7, 8, 9, 10};
        int[] arr = new int[10];
        ArrayList<Object> list = new ArrayList<>();
        TreeMap<Object, String> value = new TreeMap<>();
        HashMap<String, Integer> angle = new HashMap<>();
        List<Object> name = new ArrayList<>();
        int[][] number = new int[5][5];
        int[][][] multi = new int[4][3][3];

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i);
//        }
//        for (int i = arr.length; i > 0  ; i--) {
//            System.out.println(i);
//        }
//        for (int i = array.length; i > 0; i--) {
//            System.out.print(i+ " ");
//        }
        for (int i = 0; i < array.length ; i++) {
            if (i > largest){
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
