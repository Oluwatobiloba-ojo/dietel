package chapter_seven;

import java.security.SecureRandom;

public class AirLineReservation {

    private final boolean[] airplaneSeat = new boolean[10];

    private String seatNumber;
    private int numberOfFirstClass = 0;

    private int position;

    public AirLineReservation(int length){
        for (int seat = 0; seat < length; seat++){
            seatNumber += String.valueOf(seat)+ ",";
        }
    }

    public int getSpace() {
        return airplaneSeat.length;
    }

    public void orderForSeatInSeveralSection(int section) {
        if (section == 1) {
            firstClassSection();
        }else if(section == 2){
            economySection();
        }else {
            throw new IllegalArgumentException("Invalid input");
        }

    }

    private void economySection() {
        generateSeatPosition(6, 10);
        if (!airplaneSeat[position]) {
            airplaneSeat[position] = true;
        }else {
            throw new IllegalArgumentException("Section already fulled");

        }
    }

    private void firstClassSection() {
        generateSeatPosition(1, 5);
        if (!airplaneSeat[position]) {
            airplaneSeat[position] = true;
        }else throw new IllegalArgumentException("Section already fulled ");
    }

    private void generateSeatPosition(int startPosition, int stopPosition) {
        SecureRandom random = new SecureRandom();
        if (numberOfFirstClass != 5) {
            int number = random.nextInt(startPosition - 1, stopPosition);
            while (!seatNumber.contains(String.valueOf(number))) {
                number = random.nextInt(startPosition - 1, stopPosition);
            }
            position = number;
            seatNumber = seatNumber.replace(String.valueOf(number), "A");
            numberOfFirstClass++;
        }
    }


    public int checkForOrderSeatPosition() {
        int seatOf = 0;
        for (int seat = 0; seat < airplaneSeat.length; seat++){
            if (airplaneSeat[seat]) seatOf = seat;
        }
        return seatOf;
    }
}