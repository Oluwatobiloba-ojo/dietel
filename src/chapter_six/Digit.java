package chapter_six;

public class Digit {
    public static int sumDigit(int number) {
        int sum = 0;
        if (number > 0) {
            while (number != 0) {
                int digit = number % 10;
                sum = sum + digit;
                number /= 10;
            }
        } else {
            int thousand = 1;
            String replica = String.valueOf(number);
            int length = replica.length();
            for (int index = length - 1; index > 1; index--) {
                thousand *= 10;
            }
            int firstDigit = number / thousand;
            thousand /= 10;
            while (thousand != 0) {
                int digit = number / thousand;
                int secondDigit = digit % 10;
                sum = sum + (-(secondDigit));
                thousand /= 10;
            }
            sum += firstDigit;
        }
        return sum;
    }
}
