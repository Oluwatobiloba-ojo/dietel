package chapter_five;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.printf("%21s  %23s  %22s  %21s  %22s  %22s", "5%", "6%", "7%", "8%", "9%", "10%");
        double principal = 1000.00;
        System.out.println();
        for (int year = 1; year <= 10; year++){
            for (int rate = 5; rate <= 10; rate += 1) {
                    double percentage = (double) rate / 100;
                    double amount = principal * (Math.pow(1.0 + percentage, year));
                    System.out.printf("%4d%20.2f", year, amount);
                }
            System.out.println(" ");
            }
        }
    }
