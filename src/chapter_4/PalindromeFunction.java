package chapter_4;

public class PalindromeFunction {
    public static void main(String[] args) {
        boolean result = PalindromeFunction.palindrome(1221);
        System.out.println(result);
    }

    public static boolean palindrome(int number)
    {   int reversed = 0;
        int temp_number;
        while (number >= 999 && number <= 9999) {
            temp_number = number;
            while (!(number == 0)) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
            return temp_number == reversed;
        }
        return false;
    }
}
