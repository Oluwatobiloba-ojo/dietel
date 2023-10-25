package classwork;
import java.util.ArrayList;


public class Eratosthenes {
    public static int[] sieve(int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int count = start; count < end; count++){
           list.add(checkPrimeNumber(count));
        }
        return convertToArray(list);
    }

    private static int checkPrimeNumber(int count) {
        int countPrime = 0;
        for (int counter = 1; counter <= count; counter++){
            if (count % counter == 0){
                countPrime++;
            }
        }
        if (countPrime == 2){
            return count;
        }else {
            return 0;
        }
    }
    private static int[] convertToArray(ArrayList<Integer> numbers){
        ArrayList <Integer> math = new ArrayList<>();
        for (int count = 0; count < numbers.size(); count++){
            if (numbers.get(count) != 0){
                int result = numbers.get(count);
                math.add(result);
            }
        }
        return convertTosArray(math);
    }

    private static int[] convertTosArray(ArrayList<Integer> math) {
        int [] arrays = new int[math.size()];
        for (int count = 0; count < arrays.length; count++){
            arrays[count] = math.get(count);
        }
        return arrays;
    }
}
