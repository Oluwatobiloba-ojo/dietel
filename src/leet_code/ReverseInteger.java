package leet_code;

public class ReverseInteger {


    public static int reverse(int number) {
        String reverseValue = "";
        if (number < 0){
            String sign = String.valueOf(number).charAt(0)+"";
            number = Integer.parseInt(String.valueOf(number).substring(1));
            while (number != 0){
                reverseValue += number % 10 + "";
                number /= 10;
            }
            reverseValue = sign + reverseValue;
            return Integer.parseInt(reverseValue);
        }
        while (number != 0){
            reverseValue += number % 10 + "";
            number /= 10;
        }
        return Integer.parseInt(reverseValue);
    }
}
