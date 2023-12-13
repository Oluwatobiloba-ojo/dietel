package leet_code;

public class Telephone {

    public static String getNumber(String phoneKeypad) {
        String result = "";
        for (int count = 0; count < phoneKeypad.length(); count++){
            String value = phoneKeypad.charAt(count) + "";
            if (value.matches("[A-Za-z]")){
                int number = getPhoneKeypad(value.toUpperCase());
                result += number;
            }else {
                result += value;
            }
        }
        return result;
    }

    private static int getPhoneKeypad(String value) {
        int result = 0;
        for (PhoneKeyPad keyPad: PhoneKeyPad.values()) {
            if (keyPad.toString().contains(value)){
                result = keyPad.value;
            }
        }
        return result;
    }
}
