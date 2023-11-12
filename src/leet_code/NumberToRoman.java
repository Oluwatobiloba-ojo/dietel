package leet_code;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberToRoman {

    static final ArrayList<String> ROMAN_NUMERAL = new ArrayList<>();

    public static String intToRoman(int number) {
        addRoman();
        String result = "";
        while (number != 0) {
            if (number <= 10) {
                String value = ROMAN_NUMERAL.get(number - 1);
                result += value;
                number -= ROMAN_NUMERAL.indexOf(value) + 1;
            }else {
              String value = romanOfNumberGreaterThanTen(number);
              result += value;
              number -= value.length() * 10;
                result = romanNumberConversion(result);
            }
        }
        return result;
    }

    private static String romanNumberConversion(String result) {
        if (result.length() == 4) result = "XL";
        else if (result.length() >= 5 && result.length() <= 8) result = result.replace("XXXXX",  "L");
        else if (result.length() == 9) result = "XC";
        else if (result.length() >= 10 && result.length() < 40) result = romanNumberForC(result);
        else if (result.length() >= 40 && result.length() <= 49) result = romanNumberForCD(result);
        else if (result.length() >= 50 && result.length() < 90) result = romanNumberForD(result);
        else if (result.length() >= 90 && result.length() <= 99) result = romanNumberForCM(result);
        else result = romanNumberForM(result);
        return result;
    }

    private static String romanNumberForM(String result) {
        result = result.replace(repeatXFor(100), "M");
        int index = result.lastIndexOf("M");
        int number = result.length() - 1;
        if(number - index == 4) result = result.replace(repeatXFor(4), "XL");
        else if (number - index >= 5 && number - index <= 8) result = result.replace(repeatXFor(5), "L");
        else if (number - index == 9) result = result.replace(repeatXFor(9), "XC");
        else if (number - index >= 10 && number - index < 40) result = romanNumberForC(result);
        else if (number - index >= 40 && number - index < 50) result = romanNumberForCD(result);
        else if (number - index >= 50 && number - index < 90) result = romanNumberForD(result);
        else if (number - index >= 90) result = romanNumberForCM(result);
        return result;
    }

    private static String romanNumberForCM(String result) {
        result = result.replace(repeatXFor(90), "CM");
        int index = result.lastIndexOf("M");
        int number = (result.length()- 1) - index;
        if (number >= 5 && number <= 8) result = result.replace(repeatXFor(5), "L");
        else if (number >= 9) result = result.replace(repeatXFor(9), "XC");
        else if (number == 4) result = result.replace(repeatXFor(4), "XL");
        return result;
    }

    private static String romanNumberForC(String result) {
        result = result.replace(repeatXFor(10), "C");
        int index = result.lastIndexOf("C") + 1;
        if (result.length() - index == 4) result = result.replace(repeatXFor(4), "XL");
        if (result.length() - index >= 5 && result.length()-index < 9) result = result.replace(repeatXFor(5),  "L");
        if (result.length() - index == 9)result = result.replace(repeatXFor(9), "XC");
        return result;
    }

    private static String romanNumberForD(String result) {
        result = result.replace(repeatXFor(50), "D");
        int index = result.indexOf("D") + 1;
        if (result.length() - index >= 5 && result.length() - index < 9) result = result.replace(repeatXFor(5), "L");
        else if (result.length() - index == 4) result = result.replace(repeatXFor(4), "XL");
        else if (result.length() - index == 9) result = result.replace(repeatXFor(9), "XC");
        else if (result.length() - index >= 10) result = romanNumberForC(result);
        return result;
    }

    private static String romanNumberForCD(String result) {
        result = result.replace(repeatXFor(40), "CD");
        int index = result.indexOf("D") + 1;
        if (result.length() - index >= 5 && result.length() - index < 9) result = result.replace(repeatXFor(5), "L");
        else if (result.length() - index == 4) result = result.replace(repeatXFor(4), "XL");
        else if (result.length() - index == 9) result = result.replace(repeatXFor(9), "XC");
        return result;
    }

    private static String repeatXFor(int numberOfTimes) {
        String result = "";
        for (int count = 0; count < numberOfTimes; count++){
            result += "X";
        }
        return result;
    }

    private static String romanOfNumberGreaterThanTen(int number) {
        int count = 0;
        while (number >= 10){
            number -= 10;
            count++;
        }
        return repeatXFor(count);
    }

    public static void addRoman(){
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        ROMAN_NUMERAL.addAll(Arrays.asList(roman));
    }
}
