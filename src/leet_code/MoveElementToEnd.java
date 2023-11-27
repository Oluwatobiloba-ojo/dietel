package leet_code;

public class MoveElementToEnd {


    public static int[] elementToEnd(int[] numbers, int element){
        int[] result = new int[numbers.length];
        int counter = 0;
        for (int count = 0; count < numbers.length; count++){
            if (numbers[count] != element){
                result[counter] = numbers[count];
                counter++;
            }
        }
        return addElementToEnd(result, counter, element);
    }

    private static int[] addElementToEnd(int[] result, int counter, int element) {
        for (int count = counter; count < result.length; count++){
            result[count] = element;
        }
        return result;
    }
}
