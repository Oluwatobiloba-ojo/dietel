package chapter_five;

public class DisContinueStatement {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++){
            System.out.print(number+ " ");
            if (number == 4){
                number += 1;
            }
        }
    }
}
