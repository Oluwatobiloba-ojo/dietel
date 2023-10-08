package chibuzorarrayexcercise;

public class Finance {

    public static String creditType(String atm) {
        int length = checkLength(atm);
        if (length == 13 || length >= 16) {
            String firstCharacter = String.valueOf(atm.charAt(0));
            String secondCharacter = String.valueOf(atm.charAt(1));
            String cardType = "";
            int firstNumber = Integer.parseInt(firstCharacter);
            int secondNumber = Integer.parseInt(secondCharacter);
            if (firstNumber == 4) {
                cardType = "Visa cards";
            } else if (firstNumber == 5) {
                cardType = "Master Cards";
            } else if (firstNumber == 3 && secondNumber == 7) {
                cardType = "American Express Card";
            } else if (firstNumber == 6) {
                cardType = "Discover cards";
            } else cardType = "Invalid input";
            return cardType;
        } else {
            return "Invalid input";
        }
    }

    public static int checkLength(String atm) {
        return atm.length();
    }

    public static String validateCardDigit(String atm) {
        int firstValue = 0;
        int secondValue = 0;
        String validate = "";
        for (int i = 0; i < atm.length() ; i+= 2) {
            int multiply = atm.charAt(i) * 2;
            if (multiply >= 10){
                multiply = add(multiply);
            }
            firstValue += multiply;
        }
        for (int i = 1; i < atm.length() ; i+= 2) {
            secondValue += atm.charAt(i);
        }
        int sums = firstValue + secondValue;
        if (sums % 10 == 0){
            validate = "Valid";
        }else validate = "Invalid";
        return validate;
    }

    public static int add(int number){
        int sum = 0;
        while (number != 0){
           int value = number % 10;
           sum += value;
           number /= 10;
        }
        return sum;
    }
}
