package chapter_3;

public class TargetHeart {
    private static double targetHeartRate2;
    private String name;
    private String lastName;
    private String month;
    private int day;
    private int year;
    private static int maximum;
    private static double targetHeartRate;

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthOfBirth(String month) {
        this.month = month;
    }

    public String getMonthOfBirth() {
        return month;
    }

    public void setDayOfBirth(int day) {
        this.day = day;
    }

    public int getDayOfBirth() {
        return day;
    }

    public void setYearOfBirth(int year) {
        this.year = year;
    }

    public int getYearOfBirth() {
        return year;
    }

    public int displayAge() {
        int age;
        age = 2023 - year;
        return age;
    }

    public int displayMaximumHeartRate(int age) {
        int maximumValue = 220;
        int maximum;
        maximum = maximumValue - age;
        TargetHeart.maximum = maximum;
        return maximum;
    }

    public double displayTargetHeartRateRange1(int excercise) {
        if (excercise == 50) {
            double targetHeartRate = maximum * 0.50;
            TargetHeart.targetHeartRate = targetHeartRate;
        } else if (excercise == 70) {
            double targetHeartRate = maximum * 0.85;
            TargetHeart.targetHeartRate = targetHeartRate;
        }
        return targetHeartRate;
    }

    public double displayTargetHeartRateRange2(int excercise) {
        if (excercise == 70) {
            int targetHeartRate = (int) (maximum * 0.50);
            TargetHeart.targetHeartRate2 = targetHeartRate;
        } else if (excercise == 85) {
            int targetHeartRate = (int) (maximum * 0.85);
            TargetHeart.targetHeartRate2 = targetHeartRate;
        }
        return targetHeartRate2;
    }
}
