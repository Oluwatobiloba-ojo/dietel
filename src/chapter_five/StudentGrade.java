package chapter_five;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int excellent = 0;
        int veryGood = 0;
        int credit = 0;
        int pass = 0;
        for (int count = 0; count < 5;count++){
            System.out.println("Enter the grade of "+ (1 + count));
            String score = input.nextLine();
            score = score.toUpperCase();
            switch (score){
                case "A": {
                    excellent++;
                    break;
                }
                case "B":{
                    veryGood++;
                    break;
                }
                case "C":{
                    credit++;
                    break;
                }
                case "D":{
                    pass++;
                    break;
                }
                default:
                    System.out.println("Picked between grade A, B, C, D");
            }
        }
        System.out.printf("""
                    The number of Student Who got A is %d
                    The number of student who got B is %d
                    The number of student who got C is %d
                    The number of student who got D is %d
                """,excellent, veryGood, credit, pass);

    }
}
