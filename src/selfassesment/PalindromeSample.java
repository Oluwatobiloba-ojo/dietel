package selfassesment;

public class PalindromeSample {

    public static boolean fourDigitNumber(int number) {
        if (number > 999 && number <= 9999){
            int tempNumber = number;
            int reverse = 0;
            while (number != 0){
                reverse = reverse * 10 + (number % 10);
                number /= 10;
            }
            return reverse == tempNumber;
        }
        else {
            return false;
        }
    }
}
