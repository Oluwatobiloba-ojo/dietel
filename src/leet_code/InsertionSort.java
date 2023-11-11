package leet_code;

public class InsertionSort {


    public static int[] sort(int[] numbers) {
        for (int count = 0; count < numbers.length; count++){
            for (int counts = count+1; counts < numbers.length; counts++){
                if (numbers[counts] < numbers[count]){
                    int temp = numbers[count];
                    numbers[count] = numbers[counts];
                    numbers[counts] = temp;
                }
            }
        }
        return numbers;
    }
}
