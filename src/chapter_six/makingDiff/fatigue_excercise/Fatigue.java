package chapter_six.makingDiff.fatigue_excercise;

import java.util.Scanner;

import static chapter_six.makingDiff.fatigue_excercise.StudentFatigue.computer;

public class Fatigue {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String stopper = "CONTINUE";
        while (stopper.equals("CONTINUE")){
            computer();
            System.out.println("Enter stop to end the program and enter continue to move on ");
            stopper = input.next();
        }
    }
}
