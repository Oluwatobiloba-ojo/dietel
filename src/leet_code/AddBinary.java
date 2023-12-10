package leet_code;

public class AddBinary {

    public static String add(String firstBinary, String secondBinary) {
       int firstNumber = convertBaseToDecimal(firstBinary);
       int secondNumber = convertBaseToDecimal(secondBinary);
       int result = firstNumber + secondNumber;
       return convertDecimalToBase(result);
    }
    private static int convertBaseToDecimal(String base) {
        int decimal = Integer.parseInt(base) % 10;
        int counter = 1;
        for (int count = base.length() - 2; count >= 0; count--){
            int power = (int) Math.pow(2, counter);
            int result = Integer.parseInt(String.valueOf(base.charAt(count))) * power;
            decimal += result;
            counter++;
        }
        return decimal;
    }

    private static String convertDecimalToBase(int result) {
        String baseOutput = "";
        while (result != 0){
            baseOutput = result % 2 + baseOutput;
            result /= 2;
        }
        return baseOutput;
    }
}
