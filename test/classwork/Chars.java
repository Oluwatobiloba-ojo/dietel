package classwork;

public class Chars {

    public static int countDigitInAString(String[] characters) {
        int counter = 0;
        for (int count = 0; count < characters.length; count++) {
            for (int counts = 0; counts < characters[count].length(); counts++) {
                String character = characters[count];
                if (character.charAt(counts) == '0' || character.charAt(counts) == '1' || character.charAt(counts) == '2' || character.charAt(counts) == '3'
                        || character.charAt(counts) == '4' || character.charAt(counts) == '5' || character.charAt(counts) ==
                        '6' || character.charAt(counts) == '7' || character.charAt(counts) == '8' || character.charAt(counts)
                        == '9') {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int[] sumOfAnIndexArray(int[] numbers, int target) {
        int [] index = new int[2];
        for (int count = 0; count < numbers.length; count++){
            for (int counter = 0; counter < numbers.length; counter++){
                if (numbers[count] + numbers[counter] == target){
                    index[0] = count;
                    index[1] = counter;
                    count += numbers.length;
                    counter += numbers.length;
                }
            }
        }
        return index;
    }
}
