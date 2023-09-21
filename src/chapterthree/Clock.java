package tdd;

public class Clock {
    private int second;
    private int minute;
    private int hour;


    public Clock(int hour, int minute, int second) {
    this.second = second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }
    public void display() {
        System.out.printf("%d:%d:%d",getHour(),getMinute(),getSecond());
    }
}
