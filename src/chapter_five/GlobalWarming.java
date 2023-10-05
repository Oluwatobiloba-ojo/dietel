package chapter_five;

import java.util.Scanner;

public class GlobalWarming {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                ================================
                WELCOME TO GLOBAL WARMING QUIZ
                ================================
                """);
        System.out.println("Press start if you are ready to move on with this quiz");
        String value = input.next();
        int answer = 0;
        if (value.equals("start")) {
            answer = quiz();
        }
        if (value.equals("start")&& answer == 5) {
            System.out.println("Excellent You passed all questions " + answer);
        } else if (value.equals("start") && answer == 4) {
            System.out.println("Very Good, You had an outstanding result and you got " + answer);
        } else if(value.equals("start") && answer <= 3) {
            System.out.println("Your score is " + answer);
            System.out.println("""
                    Time to brush your head on your knowledge on global warming
                    GLOBAL WARMING ON EARTH
                    GLOBAL WARMING 101
                    CLIMATE CHANGE
                    """);
        }
    }


    public static int quiz() {
        int score = 0;
        System.out.println("""
                1. Which of the following is a green house gas
                   that is released by human activities and 
                   speed up global warming
                   a. Petroleum
                   b. Natural gas
                   c. Carbon Dioxide
                   d. nuclear power
                """);
        String firstQuiz = input.next();
        if (firstQuiz.equals("c")) score += 1;


        System.out.println();
        System.out.println("""
                2. Which of the following human activities
                   does not release carbon dioxide into the
                   atmosphere
                   a. Burning fossil fuel
                   b. Deforestation
                   c. Fishing
                   d. Driving
                """);
        String secondQuiz = input.next();
        if (secondQuiz.equals("c")) score += 1;


        System.out.println();
        System.out.println("""
                3. Rising water temperature is a result of global
                   warming and may eventually increase sea levels
                   due to dissolving of what
                   a. mountains
                   b. wetlands
                   c. river beds
                   d. glaciers
                """);
        String thirdQuiz = input.next();
        if (thirdQuiz.equals("d")) score += 1;


        System.out.println();
        System.out.println("""
                4. As global warming continues the intensity of
                   of what types of storm that hits coastline
                   is predicted to increase
                   a. tornadoes
                   b. tsunamis
                   c. hurricanes
                   d. earthQuakes
                """);
        String fourQuiz = input.next();
        if (fourQuiz.equals("c")) score += 1;


        System.out.println();
        System.out.println("""
                5. Which of the following is not a negative
                   effect of global warming
                   a. Larger fish population
                   b. new infectious diseases
                   c. species extinction
                   d. less of coastal areas
                """);
        String fifth = input.next();
        if (fifth.equals("a")) score += 1;
        return score;
    }
}
