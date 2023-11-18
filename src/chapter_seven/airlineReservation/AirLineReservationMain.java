package chapter_seven.airlineReservation;

import java.util.Arrays;
import java.util.Scanner;

public class AirLineReservationMain {
   static AirLineReservation airline = new AirLineReservation(10);
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter yes to book a flight and no to stop the booking ");
        String value = input.nextLine().toLowerCase();
        while (value.equals("yes")){
               airline.display();
            System.out.println("Enter no to stop booking or yes to continue booking: ");
            value = input.nextLine();
        }
    }
}
