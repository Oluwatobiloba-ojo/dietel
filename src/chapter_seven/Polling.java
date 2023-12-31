package chapter_seven;

import java.util.Scanner;

public class Polling {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int [][] num = new int[5][10];
        display(num);
    }












    private static void display(int[][] num) {
        int[][] survey = new int[5][10];
        int [] total = new int[5];
        int [] numbers = new int[10];
        String[] problem = {"Politics", "Environment", "Security's", "Mentality", "Inequality"};
        String moreSurvey = display();
        int times = 0;
        times = collectInput(moreSurvey, problem, survey, num, times);
        displayOfResponse(survey, problem, numbers, num, times, total);
        System.out.printf("The highest point issue is %s and the total is %d\n", problem[calculateHigherPosition(total)],
                calculateHighestPointTotal(total));
        System.out.printf("The lowest point issue is %s and the total is %d", problem[calculateLowerPosition(total)],
                calculateLowestPointTotal(total));
    }

    private static String display() {
        System.out.println("""
                    =========================================
                            WELCOME TO THE POLLING
                                    UNIT
                           FOR WHAT REALLY IS PROBLEM
                    ==========================================
                """);
        String moreSurvey = "Continue";
        moreSurvey = moreSurvey.toUpperCase();
        return moreSurvey;
    }

    private static int collectInput(String moreSurvey, String[] problem, int[][] survey, int[][] num, int times) {
        while (moreSurvey.equals("CONTINUE")) {
            surveyQuestion(problem, input, survey, num);
            System.out.println("Do you still want to go on this survey if yes type continue");
            times++;
            moreSurvey = input.next();
        }
        return times;
    }

    private static void displayOfResponse(int[][] survey, String[] problem, int[] numbers, int[][] num, int times, int[] total) {
        System.out.printf("\t\t\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%s\n",
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Average");
        for (int afterSurvey = 0; afterSurvey < survey.length; afterSurvey++) {
            System.out.print(problem[afterSurvey] + "\t\t");
            innerArray(survey, numbers, num, afterSurvey);
            int value  = calculateTotal(numbers);
            int average = value / times;
            total[afterSurvey] = value;
            System.out.print(average);
            System.out.println();
        }
    }

    private static void innerArray(int[][] survey, int[] numbers, int[][] num, int afterSurvey) {
        for (int number = 0; number < survey[afterSurvey].length; number++) {
            numbers[number] = num[afterSurvey][number];
            System.out.printf("%d\t\t", survey[afterSurvey][number]);
        }
    }

    private static void surveyQuestion(String[] problem, Scanner input, int[][] survey, int[][] num) {
        for (int issue = 0; issue < problem.length; issue++) {
            System.out.println(problem[issue]);
            System.out.println("You are to rate the social problem from 1 to 10");
            int response = input.nextInt();
            response = getInvalidResponse(input, response, problem[issue]);
            addResponse(survey, num, issue, response);
        }
    }

    private static void addResponse(int[][] survey, int[][] num, int issue, int response) {
        for (int question = 0; question < survey[issue].length; question++) {
            if (question == response - 1) {
                survey[issue][question]++;
                num[issue][question] += response;
            }
        }
    }

    private static int getInvalidResponse(Scanner input, int response, String problem) {
        while (!(response >= 1 && response <= 10)) {
            System.out.println(problem);
            System.out.println("You are to rate the social problem from 1 to 10");
            response = input.nextInt();
        }
        return response;
    }

    private static int calculateLowerPosition(int[] total) {
        int min = total[0];
        int minimum = 0;
        for (int number = 0; number < total.length; number++){
            if (total[number] < min){
                min = total[number];
                minimum = number;
            }
        }
        return minimum;
    }

    private static int calculateHigherPosition(int[] total) {
        int max = total[0];
        int maximum = 0;
        for (int number = 0; number < total.length; number++){
            if (total[number] > max){
                max = total[number];
                maximum = number;
            }
        }
        return maximum;
    }

    private static int calculateLowestPointTotal(int[] total) {
        int min = total[0];
        for (int num:total) {
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    private static int calculateHighestPointTotal(int[] total) {
        int max = total[0];
        for (int num:total) {
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    private static int calculateTotal(int[] numbers) {
        int total = 0;
        for (int number: numbers) {
            total += number;
        }
        return total;
    }
}
