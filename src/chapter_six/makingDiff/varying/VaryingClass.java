package chapter_six.makingDiff.varying;

import java.util.Scanner;

import static chapter_six.makingDiff.varying.VaryingTypes.calculate;

public class VaryingClass {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("""
    1 -> Addition
    2 -> Subtraction
    3 -> Multiplication
    4 -> Division
    5 -> Random
    """);
        int results = 0;
        int levels = input.nextInt();
        results = calculate(levels, results);
        System.out.println(results * 10);
    }
}
