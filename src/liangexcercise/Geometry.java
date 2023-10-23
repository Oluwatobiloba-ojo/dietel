package liangexcercise;

public class Geometry {
    final static double PI = Math.PI;

    public static double areaPentagon(double vertex) {
        double side = (2 * vertex) * Math.sin((PI/5));
        double numerator = 5 * (side * side);
        double denominator = 4 * Math.tan((PI/5));
        double result = numerator / denominator;
        return Double.parseDouble(String.format("%.2f", result));
    }

    public static double areaHexagon(double side) {
        double numerator = 6 * (side * side);
        double denominator = 4 * Math.tan((PI/6));
        double result = numerator / denominator;
        return Double.parseDouble(String.format("%.2f", result));
    }

    public static double areaPolygon(double side, int numberOfSide) {
        double  numerator = numberOfSide * (side * side);
        double denominator = 4 * Math.tan((PI/numberOfSide));
        double result = numerator / denominator;
        return Double.parseDouble(String.format("%.2f",result));
    }
}
