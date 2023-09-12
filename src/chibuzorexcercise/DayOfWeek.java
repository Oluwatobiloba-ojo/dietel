package chibuzorexcercise;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the days of week ");
        int day = input.nextInt();
        switch (day) {
            case 0 -> {
                System.out.println("Enter the number of day elapsed since today");
                int futureDay = input.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still sunday");
                    case 1 -> System.out.println("Today is sunday, future day is Monday");
                    case 2 -> System.out.println("Today is sunday, future day is Tuesday");
                    case 3 -> System.out.println("Today is sunday, future day is Wednesday");
                    case 4 -> System.out.println("Today is sunday, future day is Thursday");
                    case 5 -> System.out.println("Today is sunday, future day is Friday");
                    case 6 -> System.out.println("Today is sunday, future day is Saturday");
                }
            }
            case 1 -> {
                System.out.println("Enter the number of the day elapsed since today");
                int futureDay = input.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still monday");
                    case 1 -> System.out.println("Today is monday, future day is Tuesday");
                    case 2 -> System.out.println("Today is monday, future day is Wednesday");
                    case 3 -> System.out.println("Today is monday, future day is Thursday");
                    case 4 -> System.out.println("Today is monday, future day is Friday");
                    case 5 -> System.out.println("Today is monday, future day is Saturday");
                    case 6 -> System.out.println("Today is monday, future day is Sunday");
                }
            }
            case 2 -> {
                System.out.println("Enter the number of the day elapsed since today");
                int futureDay = input.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still Tuesday");
                    case 1 -> System.out.println("Today is Tuesday, future day is Wednesday");
                    case 2 -> System.out.println("Today is Tuesday, future day is Thursday");
                    case 3 -> System.out.println("Today is Tuesday, future day is Friday ");
                    case 4 -> System.out.println("Today is Tuesday, future day is Saturday");
                    case 5 -> System.out.println("Today is Tuesday, future day is Sunday");
                    case 6 -> System.out.println("Today is Tuesday, future day is Monday");
                }
            }
            case 3 -> {
                System.out.println("Enter the number of the day elapsed since today");
                int futureDy = input.nextInt();
                switch (futureDy){
                    case 0 -> System.out.println("Today is still Wednesday");
                    case 1 -> System.out.println("Today is Wednesday, future day is Thursday");
                    case 2 -> System.out.println("Today is Wednesday, future day is Friday");
                    case 3 -> System.out.println("Today is Wednesday, future day is Saturday");
                    case 4 -> System.out.println("Today is Wednesday, future day is Sunday");
                    case 5 -> System.out.println("Today is Wednesday, future day is Monday");
                    case 6 -> System.out.println("Today is Wednesday, future day is Tuesday");
                }
            }
            case 4 -> {
                System.out.println("Enter the number of the day elapsed since Today");
                int futureDay = input.nextInt();
                switch (futureDay) {
                    case 0 -> System.out.println("Today is still Thursday");
                    case 1 -> System.out.println("Today is Thursday, future day is Friday");
                    case 2 -> System.out.println("Today is Thursday, future day is Saturday");
                    case 3 -> System.out.println("Today is Thursday,future day is Sunday");
                    case 4 -> System.out.println("Today is Thursday, future day is Monday");
                    case 5 -> System.out.println("Today is thursday, future day is Tuesday");
                    case 6 -> System.out.println("Today is thursday, future day is Wednesday");
                }
            }
            case 5 -> {
                System.out.println("Enter the number of the day elapsed since Today ");
                int futureday = input.nextInt();
                switch (futureday){
                    case 0 -> System.out.println("Today is still Friday");
                    case 1 -> System.out.println("Today is Friday, future day is Saturday");
                    case 2 -> System.out.println("Today is Friday, future day is Sunday");
                    case 3 -> System.out.println("Today is Friday, future day is Monday");
                    case 4 -> System.out.println("Today is Friday, future day is Tuesday");
                    case 5 -> System.out.println("Today is Friday, future day is Wednesday");
                    case 6 -> System.out.println("Today id Friday, future day is Thursday");
                }
            }
            case 6 -> {
                System.out.println("Enter the number of the day elapsed since Today");
                int FutureDay = input.nextInt();
                switch (FutureDay){
                    case 0 -> System.out.println("Today is still Saturday");
                    case 1 -> System.out.println("Today is Saturday, future day is Sunday");
                    case 2 -> System.out.println("Today is Saturday, future day is Monday");
                    case 3 -> System.out.println("Today is Saturday, future day is Tuesday");
                    case 4 -> System.out.println("Today is Saturday, future day is Wednesday");
                    case 5 -> System.out.println("Today is Saturday, future day is Thursday");
                    case 6 -> System.out.println("Today is Saturday, future day is Friday");
                }
            }
        }
    }
}