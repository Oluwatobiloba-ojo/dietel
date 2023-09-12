package chapter_3;

import java.time.LocalDate;
import java.util.Scanner;

public class HealthSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HealthProfile myRecord = new HealthProfile("oluwaseun","ojo","male",
                31,2004,07,60,250);
        LocalDate date = LocalDate.now();
        int datenow = date.getYear();

        System.out.println(datenow);

        System.out.print("\nEnter the patient first name: ");
        String theFirst = scanner.nextLine();
        myRecord.setName(theFirst);

        System.out.print("\nEnter the patient last name: ");
        String theLast = scanner.nextLine();
        myRecord.setLastName(theLast);

        System.out.print("\nEnter the gender type: ");
        String gender = scanner.nextLine();
        myRecord.setGender(gender);

        System.out.print("\nEnter the day of birth: ");
        int theDay = scanner.nextInt();
        myRecord.setDateOfBirth(theDay);

        System.out.print("\nEnter the year of birth: ");
        int theYear = scanner.nextInt();
        myRecord.setYearOfBirth(theYear);

        System.out.print("\nEnter the month of birth: ");
        int theMonth = scanner.nextInt();
        myRecord.setMonthOfYear(theMonth);

        System.out.print("Enter your height in inches: ");
        double theHeight = scanner.nextDouble();
        myRecord.setHeight(theHeight);

        int age = datenow - theYear;
        myRecord.maximumHeartRate(age);



        System.out.print("\nEnter the weight in pounds: ");
        double theWeight = scanner.nextDouble();
        myRecord.setWeight(theWeight);

        System.out.print("\nEnter the first range: ");
        int thePercentage = scanner.nextInt();
        myRecord.TargetHeartRange(thePercentage);

        System.out.print("Enter the second range: ");
        int thePercentage2 = scanner.nextInt();
        myRecord.TargetHeartRange2(thePercentage2);

        System.out.print("\nThe first name of the patient is " +myRecord.getName());
        System.out.print("\nThe last name is " +myRecord.getLastName());
        System.out.printf("\nThe gender of the patient is %s",myRecord.getGender());
        System.out.printf("\nThe year of birth,the month of birth and day of birth is %d:%d:%d",myRecord.getYearOfBirth(),myRecord.getMonthOfYear(),myRecord.getDateOfBirth());
        System.out.printf("\nThe age of the patient is %d",age);
        System.out.printf("\nThe body mass index is %f",myRecord.getBMI());
        System.out.printf("\nThe maximum heart rate is %d",myRecord.getMaximumHeartRate());
        System.out.printf("\nThe target heart range is %.2fBpm - %.2fBpm",myRecord.getTargetHeartRange1(),myRecord.getTargetHeartRange2());

    }
}
