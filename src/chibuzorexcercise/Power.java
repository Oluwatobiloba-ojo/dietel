package chibuzorexcercise;

public class Power {
    public static void main(String[] args) {
        int number = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int result = 1;
        int result2 = 1;
        int result3 = 1;
        int result4 = 1;
        int result5 = 1;
        int power;
        int power2;
        int power3;
        int power4;
        int power5;
        System.out.println("a\tb\tpow(a,b)");
        for (power = 0; power < 2; power++) {
            result = result * number;
        }
        System.out.printf("%d\t %d\t %d\t", number, power, result);

        for (power2 = 0; power2 < 3; power2++) {
            result2 = result2 * number2;
        }
        System.out.printf("\n%d\t %d\t %d\t", number2, power2, result2);

        for (power3 = 0; power3 < 4; power3++) {
            result3 = result3 * number3;
        }
        System.out.printf("\n%d\t %d\t %d\t", number3, power3, result3);

        for (power4 = 0; power4 < 5; power4++) {
            result4 = result4 * number4;
        }
        System.out.printf("\n%d\t %d\t %d\t", number4, power4, result4);
        for (power5 = 0; power5 < 6; power5++) {
            result5 = result5 * number5;
        }
        System.out.printf("\n%d\t %d\t %d\t", number5, power5, result5);


    }
}



