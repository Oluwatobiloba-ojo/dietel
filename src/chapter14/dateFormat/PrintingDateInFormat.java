package chapter14.dateFormat;

import java.time.Month;

public class PrintingDateInFormat {
    static final Month[] MONTHS = {Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.JUNE, Month.JULY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER};
    public static String formatDate(String dateFormat) throws InvalidDateFormatException {
        if (dateFormat.matches("[0-1][0-9]/[0-3][0-9]/[0-9][0-9][0-9][0-9]")) {
            return dateFormattedToWords(dateFormat);
        } else if (dateFormat.matches("[A-Za-z]+ [0-9][0-9], [0-9][0-9][0-9][0-9]")) {
            return dateFormattedToNumber(dateFormat);
        }
        throw new InvalidDateFormatException("Format of date is either mm/dd/yyyy or Month Day, Year");
    }

    private static String dateFormattedToNumber(String dateFormat) throws InvalidDateFormatException {
        String[] dates = dateFormat.split(" ");
        String month = getMonthIntegerValue(dates[0]);
        month = padZero(month);
        String day = dates[1].split(",")[0];
        if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31) throw new InvalidDateFormatException("Day is invalid");
        String year = dates[2];
        return month + "/" + day + "/" + year;
    }

    private static String dateFormattedToWords(String dateFormat) throws InvalidDateFormatException {
        String[] dates = dateFormat.split("/");
        validatesDate(dates);
        String month = findMonthWith(dates[0]);
        return month + " " + dates[1] + ", " + dates[2];
    }

    private static String padZero(String month) {
        if (month.length() == 1){
            month = "0"+month;
        }
        return month;
    }

    private static void validatesDate(String[] dates) throws InvalidDateFormatException {
        if (Integer.parseInt(dates[1]) < 1 || Integer.parseInt(dates[1]) > 31) throw new InvalidDateFormatException("Day of date is from 1 - 31");
        if (Integer.parseInt(dates[0]) < 1 || Integer.parseInt(dates[0]) > 12) throw new InvalidDateFormatException("Month of date is from 1-12");
    }

    private static String getMonthIntegerValue(String date) throws InvalidDateFormatException {
        for (int index = 0; index < MONTHS.length; index++){
            if (MONTHS[index].name().equals(date.toUpperCase())) return String.valueOf(index+1);
        }
        throw new InvalidDateFormatException("Month is invalid");
    }

    private static String findMonthWith(String date) {
        String month = MONTHS[Integer.parseInt(date) - 1].name();
        month = month.toLowerCase();
        month = month.replace(month.charAt(0), Character.toUpperCase(month.charAt(0)));
        return month;
    }
}
