import java.util.HashMap;

public class CountCharacter {

    public static HashMap<String, Integer> countCharacter(String value) {
        HashMap<String, Integer> values = new HashMap<>();
        for (int count = 0; count < value.length(); count++){
            values.put(String.valueOf(value.charAt(count)),countLetter(value.charAt(count), value));
        }
        return values;
    }

    private static Integer countLetter(char letter, String result) {
        int counter = 0;
        for (int count = 0; count < result.length(); count++) {
            if (result.charAt(count) == letter) counter++;
        }
        return counter;
    }
}
