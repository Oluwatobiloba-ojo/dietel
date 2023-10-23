package selfassesment;

public class Loop1 {
    public static void main(String[] args) {
        int constant = 2;
        for (int number = 1; number <= 12; number++){
            System.out.printf("%d * %2d = %d",constant,number,constant*number);
            System.out.println();
        }
    }
}
