package selfassesment;

public class Square {

    public static int multiply(int number, int multiply) {
        int tempNumber = 0;
        boolean isNumberIsNegative = number < 0 && multiply < 0;
        if (multiply > 0) {
            for (int count = 1; count <= multiply; count++) {
                tempNumber += number;
            }
        } else if (multiply < 0) {
            for (int count = 1; count <= number; count++) {
                tempNumber += multiply;
            }
        }if (isNumberIsNegative){
            int convert = -1;
            number *= convert;
            multiply *= convert;
            for (int count = 1; count <= multiply; count++){
                tempNumber += number;
            }
        }
        return tempNumber;
    }
}
