package classwork;

public class Array {
    public static int[] sumOfArray(int[] numbers) {
        int [] array = new int[numbers.length];
        int sum = 0;
        int count = 0;
        for (int number = 0; number < numbers.length; number++) {
            for (int index = 0; index < numbers.length ; index++) {
                if (numbers[number] != numbers[index]){
                    sum = sum + numbers[index];
                }
                array[count] = sum;
            }
            count++;
            sum = 0;
        }
        return array;
    }
    public static int[] maximumMinimum(int [] numbers){
        int [] maximum = new int[2];
        int longest = numbers[0];
        int smallest = numbers[1];
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] > longest){
                longest = numbers[i];
            }
            if (numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        maximum[0] = longest;
        maximum[1] = smallest;
        return maximum;
    }

    public static int indexOfSmallestElement(int[] numbers) {
        int index = 0;
        int minimum = numbers[0];
        for (int count = 0; count < numbers.length; count++){
            if (numbers[count] < minimum){
                minimum = numbers[count];
                index = count;
            }
        }
        return index;
    }
    public static int[] sorts(int[] numbers) {
        for (int number = 0; number < numbers.length; number++){
            for (int num = number + 1; num < numbers.length; num++){
                if (numbers[num] < numbers[number] ){
                    int temporary = numbers[number];
                    numbers[number] = numbers[num];
                    numbers[num] = temporary;
                }
            }
        }
        return numbers;
    }
}
