package leet_code;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target){
        for (int firstSum = 0; firstSum < numbers.length;firstSum++){
            for (int secondSum = firstSum + 1; secondSum < numbers.length; secondSum++){
                if (target - numbers[secondSum] == numbers[firstSum]){
                    return new int[]{firstSum, secondSum};
                }
            }
        }
        return null;
    }
}
