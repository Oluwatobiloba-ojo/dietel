package Snacks;

public class SumOfEven {
    public static void main(String[] args) {
        int total = 0;
        for (int number = 1; number <= 10; number++){
            if (number % 2 == 0){
                total += number;
            }
        }
        System.out.println("The sum of even number within 1 to 10 is " + total);
    }
}
