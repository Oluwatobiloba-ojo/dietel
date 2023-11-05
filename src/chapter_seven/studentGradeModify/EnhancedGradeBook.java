package chapter_seven.studentGradeModify;

import java.util.Arrays;

public class EnhancedGradeBook {
    private final ExamSubject[] subjects;
    private final Student[] students;
    private final int[][] scoreBoard;

    public EnhancedGradeBook(int student, int subject) {
        this.subjects = new ExamSubject[subject];
        this.students = new Student[student];
        scoreBoard = new int[students.length][subject];
        for (int[] score : scoreBoard) {
            Arrays.fill(score, -1);
        }
        for (int stud = 0; stud < students.length; stud++){
            students[stud] = new Student(stud);
        }
        for (int sub = 0; sub < subjects.length; sub++){
            subjects[sub] = new ExamSubject(sub);
        }

    }

    public int[][] getTableOfSubjectAndStudent() {
        return scoreBoard;
    }

    public boolean isScoreBoardEmpty() {
        int emptyScore = students.length * subjects.length;
        for (int[] ints : scoreBoard) {
            for (int anInt : ints) {
                if (anInt != -1) {
                    emptyScore--;
                }
            }
        }
        return emptyScore == students.length * subjects.length;
    }

    public Student[] getStudent(){
        return students;
    }

    public ExamSubject[] getSubject() {
        return subjects;
    }

    public void setGrade(int score, Student studentOne, ExamSubject examSubject) {
        if (score >= 0){
            scoreBoard[studentOne.getName()][examSubject.getName()] = score;
        }
    }

    public int getScoreOfStudent(Student studentOne, ExamSubject examSubject) {
        return scoreBoard[studentOne.getName()][examSubject.getName()];
    }

    public int getTotalOfStudent(Student student) {
        int total = 0;
        for (int count = 0; count < scoreBoard[student.getName()].length; count++){
            if (scoreBoard[student.getName()][count] != -1) {
                total +=  scoreBoard[student.getName()][count];
            }
        }
        return total;
    }

    public int getAverage(Student student) {
        int totalScore = getTotalOfStudent(student);
        int numberOfScore =  getNumberOfScoresEntered(student);
        return totalScore/numberOfScore;
    }

    private int getNumberOfScoresEntered(Student student) {
        int count = 0;
        for (int number = 0; number < scoreBoard[student.getName()].length; number++){
            if (scoreBoard[student.getName()][number] != -1){
                count++;
            }
        }
        return count;
    }

    public int getMaximum() {
        int maximum = scoreBoard[0][0];
        for (int student = 0; student < scoreBoard.length; student++){
            for (int sub = 0; sub < scoreBoard[student].length; sub++){
                if (scoreBoard[student][sub] > maximum){
                    maximum = scoreBoard[student][sub];
                }
            }
        }
        return maximum;
    }

    public int getMinimum() {
        int minimum = scoreBoard[0][0];
        for (int student = 0; student < scoreBoard.length; student++){
            for (int sub = 0; sub < scoreBoard[student].length; sub++) {
                if (scoreBoard[student][sub] != -1) {
                    if (scoreBoard[student][sub] < minimum) {
                        minimum = scoreBoard[student][sub];
                    }
                }
            }
        }
        return minimum;
    }
}
