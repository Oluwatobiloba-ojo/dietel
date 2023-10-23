package function;

public class Ceasar{
    public static String[] cipherGenerator(int keys) {
        String [] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String [] cipher = new String[letters.length];
        int counter = 0;
        for (int count = keys; count < letters.length; count++){
            cipher[count] = letters[counter];
            counter++;
        }
        return functionShift(cipher, letters, keys);
    }

    private static String[] functionShift(String[] cipher, String[] letters, int keys) {
        int result = letters.length - keys;
        for (int count = 0; count < keys; count++){
            cipher[count] = letters[result];
            result++;
        }
        return cipher;
    }

    public static String encrypt(String character, int key) {
        String [] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String value = "";
        character = character.toUpperCase();
        for (int count = 0; count < character.length(); count++){
            for (int counter = 0; counter < letters.length; counter++){
                if (String.valueOf(character.charAt(count)).equals(letters[counter])){
                    value += getEncryptCharacter(counter, key);
                }
            }
        }
        return value;
    }

    private static String getEncryptCharacter(int counter, int key) {
        String [] cipher = cipherGenerator(key);
        return cipher[counter];
    }

    public static String decrypt(String character, int key) {
        String [] cipher = cipherGenerator(key);
        String result = "";
        character = character.toUpperCase();
        for (int count = 0; count < character.length(); count++){
            for (int counter = 0; counter < cipher.length; counter++){
                if (String.valueOf(character.charAt(count)).equals(cipher[counter])){
                    result += getDecryptValue(counter);
                }
            }
        }
        return result;
    }

    private static String getDecryptValue(int counter) {
        String [] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        return letters[counter];
    }
}
