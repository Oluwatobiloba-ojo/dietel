package leet_code;

public class UniqueBinaryString {
    static int count = 0;
    public static String unique(String[] nums) {
        count++;
        boolean result = false;
        String numbs = number(count, nums[0].length());
        for (int counter = 0; counter < nums.length; counter++){
            if (nums[counter].equals(numbs)){
                break;
            }
            if (counter == nums.length - 1) result = true;
        }
        if (!result) {return unique(nums);}
        else {
            count = 1;
            return numbs;
        }
    }

    private static String number(int num, int length){
        String result = "";
        while (num != 0){
            result += num % 2;
            num /= 2;
        }
        if (result.equals("1")) result = "00";
        while (result.length() < length){
            result = "0" + result;
        }
        return result;
    }
}
