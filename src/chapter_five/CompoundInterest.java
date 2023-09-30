package chapter_five;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.00;
        int year = 1;
        for (int rate = 5; rate <= 10; rate += 1) {
                if (year <= 10) {
                    double percentage = (double) rate / 100;
                    double amount = principal * (Math.pow(1.0 + percentage, year));
                    System.out.printf("%d%20.2f\n", year, amount);
                    year += 1;
                }
        }
    }
}
