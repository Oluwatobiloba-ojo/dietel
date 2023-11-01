package chapter_six;

import java.util.Scanner;

public class PackingCharges {
    public static double calculateCharges(int hour){
        double total;
        if (hour == 3){
            total = 2;
        } else if (hour == 24) {
            total = 10;
        }else {
            total = 0.5 * hour;
        }
        return total;
    }
}
