package chibuzorarrayexcercise;

import static chibuzorarrayexcercise.StudentGradeFunction.*;

public class StudentGrade {
    public static void main(String[] args) throws InterruptedException {
        int student = numberOfStudent();
        int subject = numberOfSubject();
        int [][] grades = new int[student][subject];
        display(grades, subject);
    }

}
