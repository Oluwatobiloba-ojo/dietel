package chapter_3;

public class NumberPrint {
    public static void main(String[] args) {
        for(int number = 1; number <= 100; number++){
            System.out.print("\t"+ number);
        }
        System.out.println();
        for (int number = 2; number <= 100; number = number + 2){
            System.out.print("\t"+ number);
        }
        System.out.println();
        for (int number = 1; number <= 100; number++){
            if (number % 2 != 0) {
                System.out.print("\t" + number);
            }
        }
    }
}
