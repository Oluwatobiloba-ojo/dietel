package leet_code;

public class UniqueBinaryString {
    static int count = 0;
    public static String findDifferentBinaryString(String[] nums) {
        boolean result = false;
        String numbs = number(count, nums[0].length());
        for (int counter = 0; counter < nums.length; counter++){
            if (nums[counter].equals(numbs)){
                break;
            }
            if (counter == nums.length - 1) result = true;
        }
        count++;
        if (!result) {return findDifferentBinaryString(nums);}
        else {
            count = 0;
            return numbs;
        }
    }

    private static String number(int num, int length){
        String result = "";
        if (num == 0) return padNumberWithZero(length, "1");
        while (num != 0){
            result += num % 2;
            num /= 2;
        }
        if (result.equals("1")) return padNumberWithZero(length, "0");
        result = padNumberWithZero(length, result);
        return result;
    }

    private static String padNumberWithZero(int length, String result) {
        while (result.length() < length){
            result = "0" + result;
        }
        return result;
    }
}
