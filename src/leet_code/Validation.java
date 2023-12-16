package leet_code;

public class Validation {

    public static boolean validate(String password) {
        return password.matches("[a-zA-Z]{6,}[0-9]{1,2}[!()@#><.^](1)");
    }
}
