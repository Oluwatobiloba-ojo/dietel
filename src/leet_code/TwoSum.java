package leet_code;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target){
        int[] indexesOfSumOfTarget = new int[2];
        int stopper = 0;
        for (int firstSum = 0; firstSum < numbers.length;firstSum++){
            for (int secondSum = firstSum + 1; secondSum < numbers.length; secondSum++){
                if (target - numbers[secondSum] == numbers[firstSum]){
                    indexesOfSumOfTarget[0] = firstSum;
                    indexesOfSumOfTarget[1] = secondSum;
                    stopper = -1;
                    break;
                }
            }
            if (stopper == -1) break;
        }
        return indexesOfSumOfTarget;
    }
}
