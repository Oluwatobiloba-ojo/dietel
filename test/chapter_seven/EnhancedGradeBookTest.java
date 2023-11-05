package chapter_seven;

import chapter_seven.studentGradeModify.EnhancedGradeBook;
import chapter_seven.studentGradeModify.ExamSubject;
import chapter_seven.studentGradeModify.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedGradeBookTest {
    EnhancedGradeBook studentGrade;
    @BeforeEach
    public void setStudentGrade(){
        studentGrade = new EnhancedGradeBook(3, 4);
    }
    @Test
    public void testForThatStudentGradeBookCanReceivedNumberOfStudentAndSubjectToFormTable(){
        int [][] grade = new int[3][4];
        for (int[] score: grade){
            Arrays.fill(score, -1);
        }
        assertArrayEquals(studentGrade.getTableOfSubjectAndStudent(), grade);
    }
    @Test
    public void testForThatNoScoreHasBeenProcessed(){
     assertTrue(studentGrade.isScoreBoardEmpty());
    }

    @Test
    public void testForWhenWeSetGradeForAParticularStudentAndSubject(){
        Student[] students = studentGrade.getStudent();
        ExamSubject[] subject = studentGrade.getSubject();
        Student studentOne = students[0];
        ExamSubject examSubject = subject[0];
        studentGrade.setGrade(50, studentOne, examSubject);
        assertEquals(studentGrade.getScoreOfStudent(studentOne, examSubject),50);
    }

    @Test
    public void testForWhenMultipleStudentScoresAreEntered(){
        Student[] students = studentGrade.getStudent();
        ExamSubject[] subject = studentGrade.getSubject();
        Student firstStudent = students[0];
        Student secondStudent = students[1];
        ExamSubject exams = subject[0];
        studentGrade.setGrade(50, firstStudent, exams);
        assertEquals(50, studentGrade.getScoreOfStudent(firstStudent, exams));
        studentGrade.setGrade(40, secondStudent, exams);
        assertEquals(40, studentGrade.getScoreOfStudent(secondStudent, exams));
    }

    @Test
    public void testThatNegativeNumberCanNotBeInputIntoTheRecord(){
        Student students = studentGrade.getStudent()[0];
        ExamSubject subject = studentGrade.getSubject()[0];
        studentGrade.setGrade(-40, students, subject);
        assertEquals(-1, studentGrade.getScoreOfStudent(students, subject));
    }

    @Test
    public void testForTheTotalScoreForAStudent(){
        Student student = studentGrade.getStudent()[0];
        ExamSubject subject = studentGrade.getSubject()[0];
        studentGrade.setGrade(40, student, subject);
        assertEquals(40, studentGrade.getTotalOfStudent(student));
    }

    @Test
    public void testForTheAverageOfScoreOfAStudent(){
        Student student = studentGrade.getStudent()[0];
        ExamSubject[] subject = studentGrade.getSubject();

        studentGrade.setGrade(50, student, subject[0]);
        studentGrade.setGrade(60, student, subject[1]);
        studentGrade.setGrade(70, student, subject[2]);
        assertEquals(60, studentGrade.getAverage(student));
    }

    @Test
    public void testForTheMaximumScore(){
        Student[] student = studentGrade.getStudent();
        ExamSubject[] subjects = studentGrade.getSubject();

        Student first = student[0];
        Student second = student[1];

        ExamSubject subjects1 = subjects[0];
        ExamSubject subject2 = subjects[1];

        studentGrade.setGrade(50, first, subjects1);
        studentGrade.setGrade(100, first, subject2);

        studentGrade.setGrade(60, second, subject2);
        studentGrade.setGrade(99, second, subjects1);

        assertEquals(100, studentGrade.getMaximum());
    }

    @Test
    public void testForMinimumWithInTheScores(){
        Student[] student = studentGrade.getStudent();
        ExamSubject[] subjects = studentGrade.getSubject();

        Student first = student[0];
        Student second = student[1];

        ExamSubject subjects1 = subjects[0];
        ExamSubject subject2 = subjects[1];

        studentGrade.setGrade(50, first, subjects1);
        studentGrade.setGrade(100, first, subject2);

        studentGrade.setGrade(60, second, subject2);
        studentGrade.setGrade(99, second, subjects1);

        assertEquals(50, studentGrade.getMinimum());

    }
}