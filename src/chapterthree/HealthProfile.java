package chapter_3;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int dateOfBirth;
    private int yearOfBirth;
    private int monthOfYear;
    private double height;
    private double weight;
    private int maximumHeartRate;
    private double bodyMassIndex;
    private int age;
    private double targetHeartRange1;
    private double targetHeartRange2;

    public HealthProfile(String name, String lastName, String gender, int dateOfBirth, int yearOfBirth
            , int monthOfYear, double height, double weight) {
        firstName = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.monthOfYear = monthOfYear;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        firstName = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMonthOfYear(int monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getMonthOfYear() {
        return monthOfYear;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void maximumHeartRate(int age) {
        int constant = 220;
        this.maximumHeartRate = constant - age;
    }

    public int getMaximumHeartRate() {
        return maximumHeartRate;
    }

    public void setBMI() {
        double value = weight / height * height;
        this.bodyMassIndex = value * 730;
    }

    public double getBMI() {
        return bodyMassIndex;
    }

    public void TargetHeartRange(int percentage) {
        if (percentage == 50) {
            this.targetHeartRange1 = maximumHeartRate * 0.50;
        }
        if (percentage == 70) {
            this.targetHeartRange1 = maximumHeartRate * 0.70;
        }
    }

    public double getTargetHeartRange1() {
        return targetHeartRange1;
    }

    public void TargetHeartRange2(int percentage2) {
        if (percentage2 == 70) {
            this.targetHeartRange2 = maximumHeartRate * 0.70;
        }
        if (percentage2 == 85) {
            this.targetHeartRange2 = maximumHeartRate * 0.85;
        }
    }

    public double getTargetHeartRange2() {
        return targetHeartRange2;
    }
}