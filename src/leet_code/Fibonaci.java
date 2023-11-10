package leet_code;

public class Fibonaci {
    public static int fibonacci(int number) {
        int numb = 0;
        int first = 1;
        for (int count = 0; count < number; count++){
            int sum = numb + first;
            first = numb;
            numb = sum;
        }
        return first;
    }
}
