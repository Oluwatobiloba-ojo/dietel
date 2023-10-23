package chapter_six;

public class PerfectNumber {
    public static void main(String[] args) {
        int total = 0;
        for (int number = 1; number < 1000; number++){
            for (int i = 1; i < number; i++){
                if (number % i == 0){
                 total += i;
                }
            }
            if (total == number){
                System.out.println(number);
            }
            total = 0;
        }
    }
    public static boolean isPerfect(int number){
        int sumOfPerfect = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sumOfPerfect += i;
            }
        }
        return sumOfPerfect == number;
    }
}
