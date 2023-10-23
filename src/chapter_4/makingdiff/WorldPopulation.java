package chapter_4.makingdiff;

public class WorldPopulation {
    public static void main(String[] args) {
        long currentPopulation = 8045311447L;
        double growthRate = 0.088;
        long total = 0;
        System.out.println("Year Population Net Difference");
        for (int year = 1; year <= 75; year++){
            total = (long) (currentPopulation * raiseToPower( 1 + growthRate, year));
            long difference = total - currentPopulation;
            System.out.println(year  + "  "+ total + " "+ difference);
        }
    }
    public static double raiseToPower(double number, int power){
        double total = 1;
        for(int index = 1; index <= power; index++){
            total *= number;
        }
        return total;
    }
}


