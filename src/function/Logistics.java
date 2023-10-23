package function;

public class Logistics {
    public static int allowance(int percentage){
        int result = 0;
        int basePay = 5000;
        if (percentage < 50) {
            result =  percentage * 160 + basePay;
        } else if (percentage <= 59) {
            result = percentage * 200 + basePay;
        } else if (percentage <= 69) {
            result = percentage * 250 + basePay;
        } else {
            result = percentage * 500 + basePay;
        }
        return result;
    }
}
