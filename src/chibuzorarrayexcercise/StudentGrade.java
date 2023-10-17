package chibuzorarrayexcercise;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many student do you have?");
        int numberOfStudent = input.nextInt();
        System.out.println("How many subject do they offer? ");
        int subjects = input.nextInt();
        int [][] grades = new int[numberOfStudent][subjects];
        int [] total = new int[numberOfStudent];
        double [] average = new double[numberOfStudent];
        int [] position;
        for (int student = 0; student < grades.length ; student++) {
            for (int numberOfSubject = 0; numberOfSubject < grades[student].length ;) {
                System.out.printf("Entering score for Student %d\n", student + 1);
                System.out.printf("Enter score for subject %d\n", numberOfSubject + 1);
                int score = input.nextInt();
                if (score >= 1 && score <= 100) {
                    grades[student][numberOfSubject] = score;
                    numberOfSubject++;
                    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println("Saved Successfully");
                }else {
                    System.out.println("The score must be from the range of 1 to 100");
                }
            }
        }
        int scoreTotal = 0;
        for (int numberOfStudents = 0; numberOfStudents < grades.length ; numberOfStudents++) {
            for (int numberOfSubject = 0; numberOfSubject <grades[numberOfStudents].length ; numberOfSubject++) {
                scoreTotal = scoreTotal + grades[numberOfStudents][numberOfSubject];
            }
            total[numberOfStudents] = scoreTotal;
            average[numberOfStudents] = (double) scoreTotal / subjects;
            scoreTotal = 0;
        }
        position = calculatePosition(total);
        System.out.print("==========================================================\n");
        displaySubject(subjects);
        System.out.print("==========================================================\n");
        for (int students = 0; students < grades.length; students++) {
            System.out.printf("STUDENT %d\t", students + 1);
            for (int subject = 0; subject < grades[students].length ; subject++) {
                System.out.print(grades[students][subject] + "\t\t");
            }
            System.out.printf("%d\t\t%.2f\t\t%d", total[students], average[students], position[students]);
            System.out.println();
        }
        System.out.print("===========================================================\n");
        System.out.println();
        System.out.print("===========================================================\n");
        for (int subject = 0; subject < grades[subject].length ; subject++) {
            int student;
            int higher;
            int lowerScore;
            int lowerStudent;
            int subjectTotal;
            double subjectAverage;
            int numberOfPasses;
            int numberOfFailure;
            int [] numbers = new int[numberOfStudent];
            for (int number = 0; number < grades.length ; number++) {
                numbers[number] = grades[number][subject];
            }
           higher = calculateHigherScore(numbers);
            student = calculateHigherStudent(numbers);
            lowerScore = calculateLowerScore(numbers);
            lowerStudent = calculateLowestStudent(numbers);
            subjectTotal = calculateTotalScore(numbers);
            subjectAverage = (double) subjectTotal / numberOfStudent;
            numberOfPasses = calculateStudentPasses(numbers);
            numberOfFailure = calculateStudentFailure(numbers);
            System.out.println();
            System.out.printf("""
                    ===========================================================
                    SUBJECT SUMMARY
                    SUBJECT %d
                    Highest Scoring Student is: Student %d scoring %d
                    Lowest Scoring Student is: Student %d scoring %d
                    Total Score is: %d
                    Average Score is: %.2f
                    Number of Passes is: %d
                    Number of Failure is: %d
                    =============================================================
                    """,subject + 1,student + 1,higher,lowerStudent + 1, lowerScore, subjectTotal, subjectAverage,
                    numberOfPasses, numberOfFailure);
            System.out.println();
        }
        int subjectPass = 0;
        int subjectFail = 0;
        int failure = 0;
        int pass = 0;
        int highestScore = 0;
        int lowestScore = 0;
        for (int subject = 0; subject < grades[subject].length ; subject++) {
            int [] numbers = new int[numberOfStudent];
            for (int student = 0; student < grades.length ; student++) {
                numbers[student] = grades[student][subject];
            }
            int passes = calculateStudentPasses(numbers);
            if (passes > pass){
                pass = passes;
                subjectPass = subject + 1;
            }
            int failures = calculateStudentFailure(numbers);
            if (failures > failure){
                failure = failures;
                subjectFail = subject + 1;
            }
            int higher = calculateHigherScore(numbers);
            if (higher > highestScore){
                highestScore = higher;
            }
            int lower = calculateLowerScore(numbers);
            if (lower > lowestScore){
                lowestScore = lower;
            }
        }
        int highestOverall = calculateOverallHighestScore(total);
        int lowestOverall = calculateOverallLowestScore(total);
        int overallStudent = calculateOverallStudentScore(total);
        int overallLowestStudent = calculateOverallLowestStudentScore(total);
        int totalTotal = calculateTotalScore(total);
        double averageTotal = (double) totalTotal / numberOfStudent;
        System.out.printf("""
                =========================================================================
                The Hardest Subject is Subject %d with %d failures
                The easiest Subject is Subject %d with %d Passes
                """,subjectFail, failure, subjectPass, pass);
        calculateHigherStudentScore(grades);
        calculateLowerStudentScore(grades);
        System.out.printf("""
                CLASS SUMMARY
                =====================================================================
                BEST GRADUATING STUDENT IS: STUDENT %d SCORING %d
                =====================================================================
                
                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                WORST GRADUATING STUDENT IS: STUDENT %d SCORING %d
                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                
                =====================================================================
                CLASS TOTAL SCORE IS: %d
                CLASS AVERAGE SCORE IS: %.2f
                =====================================================================
                """,overallStudent + 1, highestOverall,overallLowestStudent + 1, lowestOverall,totalTotal, averageTotal);


    }

    private static void calculateLowerStudentScore(int[][] total) {
        int number = 0;
        int minimum = total[0][0];
        int subject = 0;
        for (int numb = 0; numb < total.length; numb++) {
            for (int num = 0; num < total[numb].length; num++) {
                if (total[numb][num] < minimum) {
                    minimum = total[numb][num];
                    number = numb;
                    subject = num;
                }
            }
        }
        System.out.println("The overall Lowest score is scored by Student "+ (number + 1) + " in subject "
                + (subject + 1) + " scoring " + minimum);
        System.out.println("=========================================================");
    }

    private static void calculateHigherStudentScore(int[][] total) {
        int number = 0;
        int maximum = total[0][0];
        int subject = 0;
        for (int numb = 0; numb < total.length; numb++) {
            for (int num = 0; num < total[numb].length; num++) {
                if (total[numb][num] > maximum) {
                    maximum = total[numb][num];
                    number = numb;
                    subject = num;
                }
            }
        }
        System.out.println("The overall Highest score is scored by Student "+ (number + 1) + " in subject "
                        + (subject + 1) + " scoring " + maximum);
    }

    private static void displaySubject(int numberOfSubject) {
        System.out.printf("%s\t\t", "STUDENT");
        for (int numberOfSub = 0; numberOfSub < numberOfSubject; numberOfSub++) {
            int number = numberOfSub + 1;
            System.out.printf("%s\t", "SUB" + number);
        }
        System.out.printf("%s\t%s\t\t%s\n", "TOTAL", "AVERAGE", "POS");
    }

    private static int calculateOverallLowestStudentScore(int[] total) {
        int lowest = total[0];
        int student = 0;
        for (int number = 0; number < total.length ; number++) {
            if (total[number] < lowest){
                lowest = total[number];
                student = number;
            }
        }
        return student;
    }

    private static int calculateOverallStudentScore(int[] total) {
        int highest = total[0];
        int student = 0;
        for (int number = 0; number < total.length; number++){
            if (total[number] > highest){
                highest = total[number];
                student = number;
            }
        }
        return student;
    }

    private static int calculateOverallLowestScore(int[] total) {
        int lowest = total[0];
        for (int number : total){
            if (number < lowest){
                lowest = number;
            }
        }
        return lowest;
    }

    private static int calculateOverallHighestScore(int[] total) {
        int highest = total[0];
        for (int number : total) {
            if (number > highest){
                highest = number;
            }
        }
        return highest;
    }

    private static int calculateStudentFailure(int[] numbers) {
        int countFail = 0;
        for (int number : numbers) {
            if (number < 50){
                countFail++;
            }
        }
        return countFail;
    }

    private static int calculateStudentPasses(int[] numbers) {
        int countPasses = 0;
        for (int number: numbers) {
            if (number >= 50){
                countPasses++;
            }
        }
        return countPasses;
    }

    private static int calculateTotalScore(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    private static int calculateLowestStudent(int[] numbers) {
        int minimum = 0;
        int max = numbers[0];
        for (int number = 0; number < numbers.length ; number++) {
            if (numbers[number] < max){
                max = numbers[number];
                minimum = number;
            }
        }
        return minimum;
    }

    private static int calculateLowerScore(int[] numbers) {
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    private static int calculateHigherStudent(int [] numbers){
        int maximum = 0;
        int max = numbers[0];
        for (int number = 0; number < numbers.length ; number++) {
            if (numbers[number] > max){
                max = numbers[number];
                maximum = number;
            }
        }
        return maximum;
    }
    private static int[] calculatePosition(int[] total) {
        int [] position = new int[total.length];
        Arrays.fill(position, 1);
        for (int number = total.length - 1; number >= 0; number--) {
            for (int num = total.length - 1; num >= 0 ; num--) {
                if (total[number] < total[num]){
                    position[number] += 1;
                }
            }
        }
        return position;
    }
    private static int calculateHigherScore(int [] column){
        int maximum = column[0];
        for (int number : column) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }
}
