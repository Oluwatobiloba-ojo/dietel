package chibuzorarrayexcercise;

import java.util.Scanner;

import static java.lang.System.in;

public class MBTi {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        String [][] extroIntro = new String[4][5];
        int amountOfB = 0;
        int amountOfA = 0;
        String [] personalA = {"Extrovert", "Sensing", "Thinking", "Judging"};
        String [] personalB = {"Introvert", "Intuitive", "Feeling", "Perceptive"};
        String [][] a = {{"expend energy, enjoy group", "think out loud","public activities","express yourself","active, initiate"},
                        {"Interpret literally","practical","standard, usual","focus on here and now","Fact things, what it is"},
                        {"logical, thinking","candid, straight forward, frank","Tough-minded, just","issue oriented","tend to criticize"},
                        {"Organized, orderly", "plan, schedule","regulated and structured","Preparation, plan ahead","control govern"},
                };
        String [][] b = {{"conserve energy, enjoy one on one","think to yourself","solitary activities","keep to yourself","reflective, deliberate"},
                {"look for meaning and possibilities", "imaginative","different, unique","look to the future, global perspective,Big Picture","dreams, what it could be"},
                        {"empathetic, feeling","tactful, kind,encouraging","tend to appreciate", "tender-hearted, merciful","people oriented"},
                                {"flexible, adaptable", "unplanned, spontaneous","easy going, live and let live","go with the flow, adapt as you go","latitude, freedom"},
                      };
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        for (int row = 0; row <b.length ; row++) {
            for (int columns = 0; columns < b[row].length; columns++) {
                String answerB = b[row][columns];
                String answerA = a[row][columns];
                System.out.printf("""
                         A. %s                                      B. %s
                        """, answerA, answerB);
                String response = input.next();
                response = response.toUpperCase();
                while (!(response.equals("A") || response.equals("B"))) {
                    System.out.println("Expected A and B as a response: ");
                    System.out.println("I know this is an error please try again, you still have a chance ");
                    System.out.printf("""
                             A. %s                                      B. %s
                            """, answerA, answerB);
                    response = input.next();
                    response = response.toUpperCase();
                }
                if (response.equals("A")) {
                    extroIntro[row][columns] = "A." + answerA;
                } else {
                    extroIntro[row][columns] = "B." + answerB;
                }
            }
        }
        for (int row = 0; row < extroIntro.length; row++) {
            for (int response = 0; response < extroIntro[row].length; response++) {
                String request = extroIntro[row][response];
                System.out.printf("""
                        %s
                        """, request);
                if (request.charAt(0) == 'A') {
                    amountOfA++;
                } else {
                    amountOfB++;
                }
            }
            if (amountOfA > amountOfB){
                System.out.println(personalA[row]);
            } else if (amountOfB > amountOfA) {
                System.out.println(personalB[row]);
            }
            System.out.println("Number of A selected is " + amountOfA);
            System.out.println("Number of B selected is " + amountOfB);
            System.out.println();
            amountOfB = 0;
            amountOfA = 0;
        }
    }
}
