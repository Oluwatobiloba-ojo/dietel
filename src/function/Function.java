package function;

public class Function {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean prime(int number) {
        if (number <= 1) {
            return false;
        }
        int count = 0;
        int divide;
        for (int index = 1; index <= number; index++) {
            divide = number % index;
            if (divide == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static int subtraction(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber - firstNumber;
        } else {
            return firstNumber - secondNumber;
        }
    }

    public static double division(int number, int divisor) {
        double result = (double) number / divisor;
        System.out.printf("%.2f", result);
        return 0;
    }

    public static int factors(int numbers) {
        int noOfFactors = 0;
        for (int index = 1; index <= numbers; index++) {
            if (numbers % index == 0){
                noOfFactors++;
            }
        }
        return noOfFactors;
    }

    public static boolean squared(int number) {
        int square = 1;
        int count = 0;
        boolean condition = true;
        for (square = 1; square <= number; square++) {
            if (square * square == number) {
                count++;
            }
        }
        return count == 1;
    }

    public static boolean palindrome(int value) {
        int temporary_Number;
        temporary_Number = value;
        int reverse = 0;
        if (value > 9999 && value <= 99999) {
            while (value != 0) {
                int digits = value % 10;
                reverse = reverse * 10 + digits;
                value /= 10;
            }
        }
            if (temporary_Number == reverse) {
                return true;
            }
            else {
                return false;
            }
        }

    public static int factorial(int number) {
        int factorial = 1;
        for (int index = 1; index <= number; index++){
            factorial *= index;
        }
        return factorial;
    }
}
