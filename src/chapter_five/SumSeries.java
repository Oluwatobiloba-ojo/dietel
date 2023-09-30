package chapter_five;

public class SumSeries {
    public static void main(String[] args) {
        long total = 0;
        for(int number = 1; number <= 100; number++){
            total += number;
            System.out.println(number +" "+ total);
        }
    }
}
