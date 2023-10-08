package chapter_six;

import java.security.SecureRandom;

public class RandomNumberDisplay {
    public static void main(String[] args) {
        SecureRandom number = new SecureRandom();
        int multiple3 = 3 * number.nextInt(4);
        int addRandom =  + number.nextInt(4);
        int product = 10 * number.nextInt(4);
        System.out.println(multiple3 + "  " + addRandom + " " + product);
    }
}
