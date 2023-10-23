package Snacks;

import java.util.Scanner;

public class TargetGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the target value ");
        int target = input.nextInt();
        System.out.println("Enter the length at which you to input: ");
        int length = input.nextInt();
        int [] nums = new int[length];
        for (int numbers = 0; numbers < length; numbers++){
            System.out.println("Enter the integer: ");
            int integer = input.nextInt();
            nums[numbers] = integer;
        }
        for (int number  = 0; number  < nums.length; number ++) {
            for (int index = number + 1; index < nums.length ; index++) {
                if (nums[number] + nums[index] == target)System.out.println(nums[number] + " " + nums[index]);
            }
        }
    }
}
