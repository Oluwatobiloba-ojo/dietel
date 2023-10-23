package chapter_seven;

public class ArrayFunction {
    public static int largestElement(int[] arrays) {
        int largest = arrays[0];
        for (int array : arrays) {
            if (array > largest) largest = array;
        }
        return largest;
    }

    public static int[] reverseList(int[] arrays) {
        int[] result = new int[arrays.length];
        int count = 0;
        for (int number = arrays.length - 1; number >= 0; number--) {
            result[count] = arrays[number];
            count++;
        }
        return result;
    }

    public static boolean checkListElement(int[] integers, int element) {
        boolean result = false;
        for (int integer : integers) {
            if (element == integer) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int[] oddPosition(int[] integers) {
        int[] odd = new int[integers.length / 2];
        int count = 0;
        for (int number = 1; number < integers.length; number += 2) {
            odd[count] = integers[number];
            count++;
        }
        return odd;
    }

    public static int[] evenPosition(int[] integers) {
        int value;
        if (integers.length % 2 == 0) value = integers.length / 2;
        else value = integers.length / 2 + 1;
        int[] even = new int[value];
        int counter = 0;
        for (int index = 0; index < integers.length; index += 2) {
            even[counter] = integers[index];
            counter++;
        }
        return even;
    }

    public static int totalArray(int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public static boolean isPalindrome(String name) {
        String reverses = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverses = reverses + String.valueOf(name.charAt(i));
        }
        return (reverses.equals(name));
    }

    public static int forLoopSum(int[] integers) {
        int total = 0;
        for (int integer : integers) {
            total += integer;
        }
        return total;
    }

    public static int whileLoopSum(int[] integers) {
        int total = 0;
        int number = 0;
        while (number < integers.length) {
            total += integers[number];
            number++;
        }
        return total;
    }

    public static int doWhileLoopSum(int[] integers) {
        int total = 0;
        int number = 0;
        int counter = 0;
        do {
            if (counter > 0) number++;
            total += integers[number];
            counter++;
        } while (number < integers.length - 1);
        return total;
    }

    public static String[] concatenateListWithList(int[] integers, String[] character) {
        String[] array = new String[integers.length + character.length];
        for (int i = 0; i < integers.length; i++) {
            for (int a = 0; a <= i; a++) {
                array[i] = String.valueOf(integers[a]);
            }
        }
        int i = integers.length;
        for (String s : character) {
            array[i] = s;
            if (i < array.length - 1) i++;
        }
        return array;
    }

    public static String[] combinesList(int[] integers, String[] chars) {
        String[] array = new String[integers.length + chars.length];
        int first = 0;
        for (String aChar : chars) {
            array[first] = aChar;
            first += 2;
        }
        int second = 1;
        for (int integer : integers) {
            array[second] = String.valueOf(integer);
            if (second < array.length - 2) second += 2;
            else second++;
        }
        return array;
    }

    public static int[] convertIntegerToList(int number) {
        String num = String.valueOf(number);
        int[] array = new int[num.length()];
        int count = num.length() - 1;
        while (number != 0) {
            int n = number % 10;
            array[count] = n;
            count--;
            number /= 10;
        }
        return array;
    }
}
