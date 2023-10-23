package Snacks;

public class StringFunction {
    public static void main(String[] args) {
        String name = "--1101--";
        String names = "--0111--";
        System.out.println(isAnagram(name, names));
    }


    public static boolean isAnagram(String firstValue, String secondValue) {
        int counts = 0;
        if (firstValue.length() == secondValue.length()) {
            firstValue = duplicateToUpperCase(firstValue);
            secondValue = duplicateToUpperCase(secondValue);
            for (int count = 0; count < firstValue.length(); count++) {
                for (int counter = secondValue.length() - 1; counter >= 0; counter--) {
                    if (firstValue.charAt(count) == secondValue.charAt(counter)) {
                        counts++;
                        counter = 0;
                    }
                }
            }
            return counts == firstValue.length();
        }else {
            return false;
        }
    }

    private static String duplicateToUpperCase(String firstValue) {
        String replace = "";
        for (int count = 0; count < firstValue.length(); count++) {
            for (int counter = count + 1; counter < firstValue.length(); counter++) {
                if (String.valueOf(firstValue.charAt(count)).matches(String.valueOf(firstValue.charAt(counter)))) {
                    replace += String.valueOf(firstValue.charAt(count)).toUpperCase();
                    counter += firstValue.length();
                }else if (counter == firstValue.length() - 1) {
                    replace += String.valueOf(firstValue.charAt(count));
                }
            }
        }
         replace += firstValue.charAt(firstValue.length() - 1);
        return replace;
    }
}
