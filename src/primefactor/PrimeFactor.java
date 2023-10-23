package primefactor;

public class PrimeFactor {

    public static int[] prime(int number) {
        String num = "";
        int replicate = number;
        for (int count = 2; count < replicate; count++){
            while (number % count == 0){
                number /= count;
                num += count;
            }
        }
       return convertToAnArray(num);
    }


    private static int[] convertToAnArray(String num) {
        int [] result = new int[num.length()];
        for (int count = 0; count < result.length; count++){
            result[count] = Integer.parseInt(String.valueOf(num.charAt(count)));
        }
        return result;
    }
}
