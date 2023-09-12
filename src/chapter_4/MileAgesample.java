package chapter_4;

public class MileAgesample {
    private int miles;
    private int gallon;
    private double result;

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getMiles() {
        return miles;
    }

    public void setGallon(int gallon) {
        this.gallon = gallon;
    }

    public int getGallon() {
        return gallon;
    }

    public void calculateAverage() {
        double value = (double) miles / gallon;
        this.result = value;
    }

    public double checkCalculation() {
        return result;
    }
}
