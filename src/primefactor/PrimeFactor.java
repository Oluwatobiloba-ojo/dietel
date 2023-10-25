package primefactor;

import java.util.ArrayList;

public class PrimeFactor {

    public static int[] prime(int number) {
        ArrayList<Integer> num = new ArrayList<>();
        int replicate = number;
        for (int count = 2; count < replicate; count++){
            while (number % count == 0){
                number /= count;
                num.add(count);
            }
        }
       return convertToAnArray(num);
    }


    public static int[] convertToAnArray(ArrayList<Integer> num) {
        int [] result = new int[num.size()];
        for (int count = 0; count < result.length; count++){
            result[count] = num.get(count);
        }
        return result;
    }
}
