package chapter_3;

public class Multiplication {
    public static void main(String[] args) {
        for (int index = 1; index <= 12; index++) {
            int results = 24 * index;
            int results2 = 50 * index;
            int result3 = 29 * index;
            System.out.printf("24 * %d = %d \t  50 * %d = %d   \t  29 * %d = %d", index, results, index, results2, index, result3);
            System.out.println();
        }

    }
}
