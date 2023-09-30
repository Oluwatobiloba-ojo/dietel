package chapter_five;

public class Divisible3 {
    public static void main(String[] args) {
        int total = 0;
        for(int numbers = 1; numbers <= 30; numbers++){
            if (numbers % 3 == 0){
                total += numbers;
            }
        }
        System.out.println(total);
    }
}
