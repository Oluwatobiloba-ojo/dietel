package chapter14.dateFormat;

import static chapter14.ManipulatingString.input;
import static chapter14.dateFormat.PrintingDateInFormat.formatDate;

public class PrintingDateInFormatMain {

    public static void main(String[] args) {
        String date = input("Enter a date format and we convert to a opposite date format");
        try {
            System.out.println(formatDate(date));
        }catch (InvalidDateFormatException exception){
            exception.printStackTrace();
        }
    }
}
