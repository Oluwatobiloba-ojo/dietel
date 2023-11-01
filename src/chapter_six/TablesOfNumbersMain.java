package chapter_six;

import static chapter_six.TablesOfNumbers.*;

public class TablesOfNumbersMain {
    public static void main(String[] args) {
        for (int number = 1; number <= 25 ; number++) {
            System.out.println(number + "\t\t\t" + calculateBinary(number) + "\t\t\t"+ calculateOctal(number));
        }
    }
}
