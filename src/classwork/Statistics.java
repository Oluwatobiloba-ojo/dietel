package classwork;

public class Statistics {

    public static double deviation(double[] numbers) {
        double mean = mean(numbers);
        double total = 0;
        for (int number = 0; number < numbers.length; number++){
            double nums = numbers[number] - mean;
            double product = nums * nums;
            total += product;
        }
        double divide = total / (numbers.length - 1);
        double result = Math.sqrt(divide);
        return Double.parseDouble(String.format("%.3f", result));
    }

    private static double mean(double[] numbers) {
        double average = 0;
        double total = 0;
        for (double number : numbers){
            total += number;
        }
        average = total / numbers.length;
        return average;
    }
}
