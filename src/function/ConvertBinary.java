package function;

public class ConvertBinary {
    final static int BASE_POWER = 2;
    public static int binaryToDecimal(int binaryNumber) {
        String number = String.valueOf(binaryNumber);
        int counter = number.length() - 2;
        String first =  String.valueOf(number.charAt(number.length() - 1));
        int result = Integer.parseInt(first);
        for (int count = 1; count < number.length(); count++){
            String digit = String.valueOf(number.charAt(counter));
            int convertInt = Integer.parseInt(digit);
            int power = powers(count);
            result = result + (convertInt * power) ;
            counter--;
        }
        return result;
    }

    private static int powers(int power) {
        int result = 1;
        for (int count = 0; count < power; count++){
            result *= BASE_POWER;
        }
        return result;
    }

    public static int decimalToBinary(int decimal) {
        String num = "";
        while (decimal != 0){
            int remainder = decimal % BASE_POWER;
            num = remainder + num;
            decimal /= BASE_POWER;
        }
        return Integer.parseInt(num);
    }
}
