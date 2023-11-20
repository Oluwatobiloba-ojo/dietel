package classwork;

public class Sort {
    public static int[] shuffle2(int[] number){
        int counter = 0;
        for (int i = 1; i < number.length ; i+=2) {
            int temp = number[counter];
            number[counter] = number[i];
            number[i] = temp;
            counter+=2;
        }
        return number;
    }

    public static int[] shuffleMiddle(int[] numbers) {
        int middle;
        if (numbers.length % 2 == 0) middle = (numbers.length/2) -1;
        else middle = (numbers.length / 2);
        int temp = numbers[middle];
        numbers[middle] = numbers[middle +1];
        numbers[middle+1] = temp;
        return numbers;
    }
}
