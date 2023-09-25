package chapter_4;

public class SalesCalculatorSample {

    private static final int commission = 200;
    public double calculateGrossPay(int amount) {
        double salary;
        salary = (0.09 * amount) + commission;
        return salary;
    }

    public double calculateItemForMoreThanOne(double firstItem, double secondItem, double thirdItem, double fourthItem) {
        double totalItem = firstItem + secondItem + thirdItem + fourthItem;
        double result;
        result = (0.09 * totalItem) + commission;
        String value =  String.format("%.2f", result);
        result = Double.parseDouble(value);
        return result;
    }
}
