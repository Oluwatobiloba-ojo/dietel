package chapter_3;

import java.util.Scanner;

public class xmas {
    public static void xmas() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 12");
        int day = input.nextInt();
        switch (day) {
            case 1 -> System.out.println(" On the first day of christmas");

            case 2 -> System.out.println("On Second day of christmas");

            case 3 -> System.out.println("On the Third day of christmas");

            case 4 -> System.out.println("On the Fourth day of christmas");

            case 5 -> System.out.println("On the Fifth day of christmas");

            case 6 -> System.out.println("On the Sixth day of christmas");

            case 7 -> System.out.println("On the Seventh day of christmas");

            case 8 -> System.out.println("On the Eighth day of christmas");

            case 9 -> System.out.println("On the Ninth day of christmas");

            case 10 -> System.out.println("On the Tenth day of christmas");

            case 11 -> System.out.println("On the Eleventh day of christmas");

            case 12 -> System.out.println("On the Twelfth day of christmas");
        }
        switch (day) {
            case 12: {
                System.out.println("Twelve drums are drumming ");
            }
            case 11: {
                System.out.println("Eleven pipers pipping ");
            }
            case 10: {
                System.out.println("Ten lords are leaping ");
            }
            case 9: {
                System.out.println("Nine ladies are dancing ");
            }
            case 8: {
                System.out.println("Eight maids a-milking");
            }
            case 7: {
                System.out.println("Seven swans a-swimming");
            }
            case 6: {
                System.out.println("Six geese are laying ");
            }
            case 5: {
                System.out.println("Five golden rings ");
            }
            case 4: {
                System.out.println("Four calling birds");
            }
            case 3: {
                System.out.println("Three french hens ");
            }
            case 2: {
                System.out.println("Two turtle dove and");
            }
            case 1: {
                System.out.println("A partridge in a pear tree");
            }
        }
    }
}
