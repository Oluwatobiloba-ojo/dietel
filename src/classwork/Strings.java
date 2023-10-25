package classwork;

import java.util.ArrayList;
import java.util.Arrays;

import static chapter_six.Greatest.convertToArray;

public class Strings {
    public static int[] removeDuplicate(int[] numbers) {
        int[] sortNumbers = Arrays.stream(numbers).sorted().toArray();
        ArrayList<Integer> duplicate = new ArrayList<>();
        for (int count = 0; count < sortNumbers.length; count++){
            count = getHowManyStepToJump(count, sortNumbers, duplicate);}return convertToArray(duplicate);
    }

    private static int getHowManyStepToJump(int count, int[] sortNumbers, ArrayList<Integer> duplicate) {
        for (int counter = count + 1; counter < sortNumbers.length; counter++){
            if (sortNumbers[count] == sortNumbers[counter]){
                duplicate.add(sortNumbers[count]);
                count += checkDuplicateInArray(sortNumbers, sortNumbers[count], count);
                counter = sortNumbers.length;
            }
        }
        return count;
    }

    private static int checkDuplicateInArray(int[] sortNumber, int numberToCount, int count) {
        int numberTimes = 0;
        for (int counts = count + 1; counts < sortNumber.length; counts++){
            if (sortNumber[counts] == numberToCount){numberTimes++;}}return numberTimes;
    }


    public static String reverseAString(String sentence) {
        int spaceIndex = checkOutTheIndexWhichHaveSpace(sentence);
        String sentences = sumUpTheCharacterAfterWhiteSpaces(sentence);
        for (int word = sentence.length() - 1; word > spaceIndex; word--){
            sentences += String.valueOf(sentence.charAt(word));}return sentences;}

    private static int checkOutTheIndexWhichHaveSpace(String sentence) {
        int index = 0;
        for (int word = 0; word < sentence.length(); word++){
            if (sentence.charAt(word) == ' ') index = word;}return index;}

    private static String sumUpTheCharacterAfterWhiteSpaces(String sentence) {
        int index;
        String sentences = "";
        int number = 0;
        for (int word = 0; word < sentence.length(); word++) {
            if (sentence.charAt(word) == ' ') {
                index = word;
                for (int count = index - 1; count >= number; count--) {
                    sentences += sentence.charAt(count);
                    if (index - 1 == 0 ){
                        sentences += " ";
                        number++;
                    }
                }
            }
        }
        if (sentences.charAt(sentences.length()- 1) != ' ') return sentences + " ";
        else return sentences;
    }


    public static boolean checkReverse(String word){
      String reverse =  reverse(word);
      return word.equalsIgnoreCase(reverse);
    }

    private static String reverse(String word) {
        String reversed = "";
        for (int count = word.length() - 1; count >= 0; count--){
            reversed += String.valueOf(word.charAt(count));
        }
        return reversed;
    }

    public static int[] checkForDominantArray(int[] numbers) {
        ArrayList<Integer>dominants = new ArrayList<>();
        int countDominant = 0;
        for (int number = 0; number < numbers.length; number++){
            for (int num = number + 1; num < numbers.length; num++){
                if (numbers[number] > numbers[num])countDominant++;}
            if (countDominant == numbers.length - (number+ 1)) dominants.add(numbers[number]);countDominant = 0;}return convertToArray(dominants);}

    public static String checkForAStringIsHavingNumber(String number) {
        if (number.matches("\\d+")){return "Valid";
        }else {return "invalid input";}}

    public static boolean isTargetInNumber(String number, int target, int[] indices) {
        boolean result = false;
        for (int index = 0; index < number.length(); index++){
            for (int indexes = index + 1; indexes < number.length(); indexes++){
                if (index == indices[0] && indexes == indices[1]){
                    result = checkRangeOfNumber(target, index, indexes, number);
                }
            }
        }
        return result;
    }

    private static boolean checkRangeOfNumber(int target, int index, int indexes, String number) {
        boolean value = target < Integer.parseInt(String.valueOf(number.charAt(indexes)));
        if (String.valueOf(index).equals("-")){
            return target > '-' + Integer.parseInt(String.valueOf(number.charAt(index + 1))) && value;
        }
        return target > Integer.parseInt(String.valueOf(index)) && value;
    }
}
