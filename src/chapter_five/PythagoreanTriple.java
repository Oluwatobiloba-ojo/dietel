package chapter_five;

public class PythagoreanTriple {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            for (int j = 1; j <= 50; j++){
                for (int b = 1; b<= 50; b++){
                    if ((i * i) + (j * j) == (b * b)){
                        System.out.println(i + "+" +  j  +  "="  + b);
                    }
                }
            }
        }
    }
}
