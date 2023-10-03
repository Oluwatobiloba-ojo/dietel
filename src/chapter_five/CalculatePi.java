package chapter_five;

public class CalculatePi { 
   private final static int CONSTANT = 4;
   private final static double PIE = 3.14159;
    public static void main(String[] args) {
        int count = 0;
        double pie = 0;
    for (int number = 1; number < 200_000; number+=2) {
        if (count % 2 == 0) {
            pie += (double) CONSTANT / number;
        } else {
            pie += -((double) CONSTANT / number);
        }
        count++;
       pie = Double.parseDouble(String.format("%.5f", pie));
        if (pie < PIE) {
            System.out.println(number + "\t\t" + pie);
        }
    }
    }
}
