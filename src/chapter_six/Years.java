package chapter_six;

public class Years {


    public static boolean isLeapYear(int year) {
        int length = String.valueOf(year).length();
        if (length == 4 && year > 1111) {
            return year % 4 == 0;
        }else {
            return false;
        }
    }
}
