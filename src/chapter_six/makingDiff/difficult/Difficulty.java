package chapter_six.makingDiff.difficult;
import java.util.Scanner;
import static chapter_six.makingDiff.difficult.DifficultyLevel.*;
public class Difficulty {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int result = 0;
        System.out.println("Enter 1 -> Difficulty Level 1\n" +
                "Enter 2 -> Difficult level 2");
        int level = input.nextInt();
        result =  result(level, result);
        double percentage = calculatePercentage(result);
        response(percentage);
    }
}
