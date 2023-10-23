package classwork;

public class Multiplied {
    public static void main(String[] args) {
        int x = 3;
        int n = 4;
        int answer = 1;
        for (int i = 1; i <= n; i++){
            answer *= x;
        }
        System.out.println(answer);
    }
}
