package arraysnacks;

public class VariableLengthArgument {

    public static double average(int ... arrays){

     int total = 0;
     double average;
        for (int number: arrays) {
            total += number;
        }
        average = (double) total / arrays.length;
        String result = String.format("%.2f", average);
        return Double.parseDouble(result);
    }
}
