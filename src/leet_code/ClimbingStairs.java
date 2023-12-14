package leet_code;

import java.util.ArrayList;
import java.util.Arrays;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int count = 1;
        ArrayList<Integer> nums = getFirstStep(n);
        for (int i = 0; i < nums.size(); i++) {
           count += upgradeSteps(i, nums, n);
        }
        return count;
    }

    private static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    private static int upgradeSteps(int i, ArrayList<Integer> nums, int value) {
       int count = 0;
        int [] numbers = new int[nums.size() - 1];
        for (int j = 0; j < numbers.length; j++) {
            if (i == j){
                numbers[j] = 2;
                continue;
            }
            numbers[j] = 1;
        }
        if (sum(numbers) == value)count++;
        System.out.println(Arrays.toString(numbers));
        if (sumDifferently(numbers, i) == value) count++;
       return count;
    }

    private static int sumDifferently(int[] numbers, int number) {
       int result = 0;
        if (numbers.length - number >= 2){
           for (int i = 0; i < numbers.length; i++) {
               if (i == number + 1 || i == number + 2){
                   if (i == number+2){
                       result += 2;
                   }
               }else continue;
               result += numbers[i];
           }
       }
        return result;
    }

    private static ArrayList<Integer> getFirstStep(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            result.add(1);
        }
        return result;
    }
}
