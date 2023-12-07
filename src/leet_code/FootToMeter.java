package leet_code;

import java.util.function.DoubleBinaryOperator;

public class FootToMeter {


    public static double footToMeter(double foot) {
        double footConvert = 0.305;
        return footConvert * foot;
    }

    public static double meterToFeet(double meter) {
      double meterConverter = 3.279;
      double total =  meterConverter * meter;
      total = Double.parseDouble(String.format("%.4f", total));
      return total;
    }
}
