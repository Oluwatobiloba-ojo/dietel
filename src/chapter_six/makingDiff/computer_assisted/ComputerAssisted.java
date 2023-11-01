package chapter_six.makingDiff.computer_assisted;

import java.util.Scanner;

import static chapter_six.makingDiff.computer_assisted.ComputerAssistedInstruction.computer;

public class ComputerAssisted {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String stopper = "CONTINUE";
        while (stopper.equals("CONTINUE")){
            computer();
            System.out.println("Very Good");
            System.out.println("Enter stop to end the program and enter continue to move on ");
            stopper = input.next().toUpperCase();
        }
    }
}
