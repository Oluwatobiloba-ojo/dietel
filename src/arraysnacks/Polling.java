package arraysnacks;

import java.util.Scanner;

public class Polling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] problem = {"Politics", "Environment", "Security's", "Mentality",
                "Inequality"};
        int [] total = new int[5];
        int[][] survey = new int[5][10];
        int [][] num = new int[5][10];
        int [] numbers = new int[10];
        System.out.println("""
                    =========================================
                            WELCOME TO THE POLLING
                                    UNIT
                           FOR WHAT REALLY IS PROBLEM
                    ==========================================
                """);
        String moreSurvey = "Continue";
        int times = 0;
        moreSurvey = moreSurvey.toUpperCase();
        while (moreSurvey.equals("CONTINUE")) {
            for (int issue = 0; issue < problem.length; issue++) {
                System.out.println(problem[issue]);
                System.out.println("You are to rate the social problem from 1 to 10");
                int response = input.nextInt();
                while (!(response >= 1 && response <= 100)) {
                    System.out.println(problem[issue]);
                    System.out.println("You are to rate the social problem from 1 to 10");
                    response = input.nextInt();
                }
                for (int question = 0; question < survey[issue].length; question++) {
                    if (question == response - 1) {
                        survey[issue][question]++;
                        num[issue][question] += response;
                    }
                }
            }
            System.out.println("Do you still want to go on this survey if yes type continue");
            times++;
            moreSurvey = input.next();
        }
        System.out.printf("\t\t\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%s\n",
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Average");
        for (int afterSurvey = 0; afterSurvey < survey.length; afterSurvey++) {
            System.out.print(problem[afterSurvey] + "\t\t");
            for (int number = 0; number < survey[afterSurvey].length; number++) {
                numbers[number] = num[afterSurvey][number];
                System.out.printf("%d\t\t", survey[afterSurvey][number]);
            }
            int value  = calculateTotal(numbers);
            int average = value / times;
            total[afterSurvey] = value;
            System.out.print(average);
            System.out.println();
        }
        int highest = calculateHighestPointTotal(total);
        int lowest = calculateLowestPointTotal(total);
        int highestPoint = calculateHigherPosition(total);
        int lowestPoint = calculateLowerPosition(total);
        System.out.printf("The highest point issue is %s and the total is %d\n", problem[highestPoint], highest);
        System.out.printf("The lowest point issue is %s and the total is %d", problem[lowestPoint], lowest);
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
