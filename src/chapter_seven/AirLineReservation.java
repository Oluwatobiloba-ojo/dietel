package chapter_seven;

import java.util.Arrays;
import java.util.Scanner;

public class AirLineReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean [] flightSeats = new boolean[10];
        System.out.println("Enter Type 1 for first class and Type 2 for economy class: ");
        String response = input.nextLine();
        if (response.equals("1")){
            System.out.println("Enter the number of participant you are boarding for from seat 1 to 5: ");
            int numberOfAttendance = input.nextInt();
            for (int i = 0; i < numberOfAttendance ; i++) {
                flightSeats[i] = true;
            }
            System.out.print(Arrays.toString(flightSeats));
        } else if (response.equals("2")) {
            System.out.println("Enter the number of participant you are boarding for from seat 6 - 10: ");
            int numberOfAttendance = input.nextInt();
            for (int i = 5; i <= numberOfAttendance ; i++) {
                flightSeats[i] = true;
            }
            System.out.print(Arrays.toString(flightSeats));
        }
    }
}
