package Snacks;

public class FormatInteger {
    public static String format(int number, int width) {
        int length = String.valueOf(number).length();
        String value = String.valueOf(number);
        while (length < width){
            value = "0" + value;
            length = value.length();
        }
        return value;
    }
}
