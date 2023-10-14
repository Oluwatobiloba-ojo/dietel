package chapter_six;

public class TablesOfNumbers {
    public static void main(String[] args) {
        for (int number = 1; number <= 25 ; number++) {
            System.out.println(number + "\t\t\t" + calculateBinary(number) + "\t\t\t"+ calculateOctal(number));
        }
    }
    public static String calculateBinary(int number){
        String nums = "";
        while (number != 0){
            int modulo = number % 2;
            nums = modulo + nums;
            number /= 2;
        }
        return nums;
    }
    public static String calculateOctal(int number){
        String nums = "0";
        while (number != 0){
            int modulo = number % 8;
            nums = nums + modulo;
            number /= 8;
        }
        if (nums.length() == 3){
            String firstDigit = String.valueOf(nums.charAt(0));
            String secondDigit = String.valueOf(nums.charAt(1));
            String thirdDigit = String.valueOf(nums.charAt(2));
            nums = firstDigit + thirdDigit + secondDigit;
        }
        if (nums.length() == 2){
            nums = "0" + nums;
        }
        return nums;
    }
}
