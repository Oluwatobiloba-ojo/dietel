package function;

public class TestDriller {
    public static int calculateCostOfCopy(int copies) {
        int result = 0;
        if (copies >= 1 && copies < 5) {
            result = copies * 2000;
        } else if (copies <= 9) {
            result = copies * 1800;
        } else if (copies <= 29) {
            result = copies * 1600;
        } else if (copies <= 49) {
            result = copies * 1500;
        } else if (copies <= 99) {
            result = copies * 1300;
        } else if (copies <= 199) {
            result = copies * 1200;
        } else if (copies <= 499) {
            result = copies * 1100;
        } else{
            result = copies * 1000;
        }
        return result;
    }
    public static int amountOfCopy(int copy){
        return calculateCostOfCopy(copy);
    }

}
