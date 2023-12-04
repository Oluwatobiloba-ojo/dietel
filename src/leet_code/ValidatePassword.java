package leet_code;

public class ValidatePassword {

    public static boolean isValid(String value){
        return value.matches("[a-zA-z]{6,}[0-9]{1,2}");
    }
}
