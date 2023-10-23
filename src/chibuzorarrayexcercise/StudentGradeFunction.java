 package chibuzorarrayexcercise;

import java.util.Arrays;
import java.util.Scanner;

 public class StudentGradeFunction {

     public static int numberOfSubject(){
         Scanner input = new Scanner(System.in);
         System.out.println("How many subject do you have?");
         return input.nextInt();
     }
     public static int numberOfStudent(){
         Scanner input = new Scanner(System.in);
         System.out.println("How many student do you have?");
         return input.nextInt();
     }
     public static void display(int[][] grades,int numberOfSubject){
         collectTheScoresOfStudent(grades);
         displayScoreGrade(grades, calculateSum(grades), calculateAverage(calculateSum(grades), numberOfSubject),
                            calculatePosition(calculateSum(grades)) );
         displaySubjectSummary(grades, numberOfSubject);
         displayFirstSummary(grades);
         displaySummary(calculateSum(grades));
     }
     public static void collectTheScoresOfStudent(int[][] grades) {
         Scanner input = new Scanner(System.in);
         for (int student = 0; student < grades.length ; student++) {
             System.out.println();
             for (int numberOfSubject = 0; numberOfSubject < grades[student].length ;) {
                 System.out.printf("Entering score for Student %d\n", student + 1);
                 System.out.printf("Enter score for subject %d\n", numberOfSubject + 1);
                 int score = input.nextInt();
                 if (score >= 1 && score <= 100) {
                     grades[student][numberOfSubject] = score;
                     numberOfSubject++;
                     if (numberOfSubject <= grades[student].length - 1) {
                         displaySaving(numberOfSubject);
                     }
                 }else {
                     System.out.println("The score must be from the range of 1 to 100");
                 }
             }
             System.out.println("Saved successfully");
         }
     }
     public static void displaySaving(int count){
         System.out.print("Saving");
         for (int counter = 0; counter < count; counter++){
             System.out.print(">>>");
         }
         System.out.println();
     }
     public static void displayScoreGrade(int [][] grades, int[] total, double[] average, int[] position) {
         display("==");
         displaySubject(grades[0].length);
         display("==");
         for (int students = 0; students < grades.length; students++) {
             System.out.printf("STUDENT %d\t", students + 1);
             for (int subject = 0; subject < grades[students].length; subject++) {
                 System.out.print(grades[students][subject] + "\t\t");
             }
             System.out.printf("%d\t\t%.2f\t\t%d", total[students], average[students], position[students]);
             System.out.println();
         }
         display("==");
         display("==");
     }
         public static void displaySubjectSummary(int [][] grades, int subjects){
                 System.out.println("SUBJECT SUMMARY");
         for (int subject = 0; subject < subjects; subject++) {
                 int[] numbers = new int[grades.length];
                 for (int number = 0; number < grades.length; number++) {
                     numbers[number] = grades[number][subject];
                 }
                 System.out.println();
                 display("==");
                System.out.println("SUBJECT  "+ (subject + 1));
                System.out.println("Highest Scoring Student is: " + "Student " + calculateHigherStudent(numbers) +
                            " Scoring " + calculateHigherScore(numbers));
                System.out.println("Lowest Scoring Student is: " + "Student " + calculateLowestStudent(numbers) +
                     " Scoring " + calculateLowerScore(numbers));
                System.out.println("Total Score is " + calculateTotalScore(numbers));
                System.out.println("Average Score is " + (double)calculateTotalScore(numbers) / grades.length);
                System.out.println("Number Of Passes is: " + calculateStudentPasses(numbers));
                System.out.println("Number Of Failures is: " + calculateStudentFailure(numbers));
                display("==");
         }
     }
     public static void displayFirstSummary(int[][] grades){
         display("==");
         System.out.println("The hardest Subject is Subject " + calculatePass(calculateNumbersOfFailure(grades))[0] +
                 " with " + calculatePass(calculateNumbersOfFailure(grades))[1]+ " failures");
         System.out.println("The easiest Subject is Subject " + calculatePass(calculateNumbersOfPasses(grades))[0] +
                 " with " + calculatePass(calculateNumbersOfPasses(grades))[1]);
         System.out.println("The overall Highest score is scored by Student " + calculateHigherStudentScore(grades)[0]+
                 " in Subject " + calculateHigherStudentScore(grades)[1]+ " scoring " + calculateHigherStudentScore(grades)[2]);
         System.out.println("The overall lowest score is scored by Student " + calculateLowerStudentScore(grades)[0] +
                 " in Subject " + calculateLowerStudentScore(grades)[1]+ " scoring " + calculateLowerStudentScore(grades)[2]);
         display("==");
     }
        public static void displaySummary(int [] total){
            int totalSum = calculateTotalScore(total);
            System.out.println("CLASS SUMMARY");
            display("==");
            System.out.printf("BEST GRADUATING STUDENT IS: STUDENT %d SCORING %d\n",calculateOverallStudentScore(total)[0],
                    calculateOverallStudentScore(total)[1]);
            display("==");
            System.out.println();
            display("!!");
            System.out.printf("WORST GRADUATING STUDENT IS: STUDENT %d SCORING %d\n",calculateOverallLowestStudentScore(total)[0],
                    calculateOverallLowestStudentScore(total)[1]);
            display("!!");
            System.out.println();
            display("==");
            System.out.printf("CLASS TOTAL SCORE IS: %d\n", totalSum);
            System.out.printf("CLASS AVERAGE SCORE IS: %.2f\n", (double)totalSum/total.length);
            display("==");
        }

    public static int[] calculatePass(int[] numbersOfStudentPass) {
        int max = numbersOfStudentPass[0];
        int subject = 1;
        for (int count = 0; count < numbersOfStudentPass.length; count++){
            if (numbersOfStudentPass[count] > max){
                max = numbersOfStudentPass[count];
                subject = count+1;
            }
        }
        return new int[]{subject, max};
    }
     public static int[] calculateNumbersOfPasses(int [][] grades){
         int [] numbersOfStudentPass = new int[grades[0].length];
         for (int subject = 0; subject < grades[0].length ; subject++) {
             int[] numbers = new int[grades.length];
             for (int number = 0; number < grades.length; number++) {
                 numbers[number] = grades[number][subject];
             }
             numbersOfStudentPass[subject] = calculateStudentPasses(numbers);
         }
         return numbersOfStudentPass;
     }
     public static int[] calculateNumbersOfFailure(int[][] grades){
         int [] numbersOfStudentPass = new int[grades[0].length];
         for (int subject = 0; subject < grades[0].length ; subject++) {
             int[] numbers = new int[grades.length];
             for (int number = 0; number < grades.length; number++) {
                 numbers[number] = grades[number][subject];
             }
             numbersOfStudentPass[subject] = calculateStudentFailure(numbers);
         }
         return numbersOfStudentPass;
     }

    public static double[] calculateAverage(int[] total, int subject) {
        double[] average = new double[total.length];
        for (int number = 0; number < total.length; number++){
            average[number] = (double) total[number] / subject;
        }
        return average;
    }

    public static int [] calculateSum(int [][] grades){
        int scoreTotal = 0;
        int [] total = new int [grades.length];
        for (int numberOfStudents = 0; numberOfStudents < grades.length ; numberOfStudents++) {
            for (int numberOfSubject = 0; numberOfSubject < grades[numberOfStudents].length; numberOfSubject++) {
                scoreTotal = scoreTotal + grades[numberOfStudents][numberOfSubject];
            }
            total[numberOfStudents] = scoreTotal;
            scoreTotal = 0;
        }
        return total;
    }

    public static int[] calculateLowerStudentScore(int[][] total) {
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
        return new int[]{number + 1, subject + 1, minimum};
    }

    public static int[] calculateHigherStudentScore(int[][] total) {
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
        return new int[]{number + 1, subject + 1, maximum};
    }

    public static void displaySubject(int numberOfSubject) {
        System.out.printf("%s\t\t", "STUDENT");
        for (int numberOfSub = 0; numberOfSub < numberOfSubject; numberOfSub++) {
            int number = numberOfSub + 1;
            System.out.printf("%s\t", "SUB" + number);
        }
        System.out.printf("%s\t%s\t\t%s\n", "TOTAL", "AVERAGE", "POS");
    }

    public static int[] calculateOverallLowestStudentScore(int[] total) {
        int lowest = total[0];
        int student = 0;
        for (int number = 0; number < total.length ; number++) {
            if (total[number] < lowest){
                lowest = total[number];
                student = number;
            }
        }
        return new int[]{student + 1, lowest};
    }

    public static int[] calculateOverallStudentScore(int[] total) {
        int highest = total[0];
        int student = 0;
        for (int number = 0; number < total.length; number++){
            if (total[number] > highest){
                highest = total[number];
                student = number +1;
            }
        }
        return new int[]{student, highest};
    }

    public static int calculateStudentFailure(int[] numbers) {
        int countFail = 0;
        for (int number : numbers) {
            if (number < 50){
                countFail++;
            }
        }
        return countFail;
    }

    public static int calculateStudentPasses(int[] numbers) {
        int countPasses = 0;
        for (int number: numbers) {
            if (number >= 50){
                countPasses++;
            }
        }
        return countPasses;
    }

    public static int calculateTotalScore(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculateLowestStudent(int[] numbers) {
        int minimum = 0;
        int max = numbers[0];
        for (int number = 0; number < numbers.length ; number++) {
            if (numbers[number] <= max){
                max = numbers[number];
                minimum = number + 1;
            }
        }
        return minimum;
    }

    public static int calculateLowerScore(int[] numbers) {
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    static int calculateHigherStudent(int[] numbers){
        int maximum = 0;
        int max = numbers[0];
        for (int number = 0; number < numbers.length ; number++) {
            if (numbers[number] >= max){
                max = numbers[number];
                maximum = number + 1;
            }
        }
        return maximum;
    }
    static int[] calculatePosition(int[] total) {
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
    public static int calculateHigherScore(int[] column){
        int maximum = column[0];
        for (int number : column) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }
    public static void display(String character){
         for (int count = 0; count < 40; count++){
             System.out.print(character);
         }
        System.out.println();
    }
}
