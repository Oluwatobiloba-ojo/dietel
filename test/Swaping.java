import java.util.Arrays;

public class Swaping {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};
        int startIndex = 0;
        int swapper = 2;
        Swaping.swap(numbers, startIndex, swapper);
    }

    public static int[] swap(int[] numbers, int startIndex, int swapper) {
        numbers[startIndex] = numbers[startIndex] + numbers[swapper];
        numbers[swapper] = numbers[startIndex] - numbers[swapper];
        numbers[startIndex] = numbers[startIndex] - numbers[swapper];
        return numbers;
    }
}
