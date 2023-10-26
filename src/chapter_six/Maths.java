package chapter_six;

public class Maths {
    public static double floor(double number) {
        return (int) (number + 0.5);
    }
    public static double roundToTenth(double x) {
        return Maths.floor(x * 10 + 0.5) / 10;
    }
    public static int roundToIntegers(double nums) {
        return (int)Maths.floor(nums);
    }
    public static double roundToHundred(double nums) {
        return Maths.floor(nums * 100 + 0.5) / 100;
    }
    public static double roundToThousands(double nums) {
        return Maths.floor(nums * 1000 + 0.5) / 1000;
    }
    public static double calculateHypotenuse(double side1, double side2) {
       double side1Sqr = squareNumber(side1);
       double side2Sqr = squareNumber(side2);
       double sumOfSquares = side1Sqr + side2Sqr;
        return squareRootNumber(sumOfSquares);
    }
    private static double squareRootNumber(double sumOfSquares) {
        double value = 0;
        for (int number = 0; number < sumOfSquares; number++) {
            if (number * number == sumOfSquares){
                value = number;
            }
        }
        return value;
    }
    private static double squareNumber(double side1) {
        double square = 1;
        for (int i = 0; i < 2 ; i++) {
            square *= side1;
        }
        return square;
    }

    public static double calculateDistance(double v, double v1, double v2, double v3) {
        double firstSide = v2 - v;
        firstSide = squareNumber(firstSide);
        double secondSide = v3 - v1;
        secondSide = squareNumber(secondSide);
        double result = firstSide + secondSide;
        result = squareRootNumber(result);
        return result;
    }

    public static boolean divisible5(int number) {
        return number % 5 == 0;
    }
}
