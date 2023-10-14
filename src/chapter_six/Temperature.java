package chapter_six;

public class Temperature {
    public static final double CONSTANT = 273.15;
    public static double convertKelvin(double temperate) {
        return CONSTANT + temperate;
    }

    public static double convertCelsius(double temperate) {
        double result =  temperate - CONSTANT;
        String ans = String.format("%.2f", result);
        return Double.parseDouble(ans);
    }

    public static double convert(double temperate) {
        double result;
        if (temperate > CONSTANT){
            result = convertCelsius(temperate);
        }else {
            result = convertKelvin(temperate);
        }
        return result;
    }
}
